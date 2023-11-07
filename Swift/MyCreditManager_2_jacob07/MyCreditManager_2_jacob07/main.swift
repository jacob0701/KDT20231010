//
//  main.swift
//  MyCreditManager_2_jacob07
//
//  Created by Lacon85 on 2023/08/16.
//

import Foundation


var student = Set<String>()
var subject = Set<String>()
var credit: [String:String] = [:]
var grade: [String] = []
let allScores: [String] = ["A+","A0","B+","B0","C+","C0","D+","D0","F"]

print("""
원하는 기능을 입력해주세요.
1: 학생추가, 2: 학생삭제, 3: 성적추가(변경), 4: 성적삭제, 5: 평점보기, X: 종료
""")
var input: String? = readLine()

while input != "X" && input != "x" {
    
    if input == "1" {
        print("추가할 학생의 이름을 입력해 주세요.")
        var name: String? = readLine()
        if name == ""  {
            print("입력이 잘못되었습니다. 다시 확인해주세요.")
        } else if student.contains(name!) {
            print("\(name!)은(는) 이미 존재하는 학생입니다. 추가하지 않습니다.")
        } else {
            print("\(name!) 학생을 추가하였습니다.")
            student.insert(name!)
        }
    }
    
    else if input == "2" {
        print("삭제할 학생의 이름을 입력해 주세요.")
        var name: String? = readLine()
        if name == ""  {
            print("입력이 잘못되었습니다. 다시 확인해주세요")
        } else if student.contains(name!) {
            student.remove(name!)
            print("\(name!) 학생을 삭제하였습니다.")
        } else {
            print("\(name!) 학생을 찾지 못했습니다.")
        }
    }
    
    else if input == "3" {
        print("성적을 추가할 학생의 이름, 과목 이름, 성적(A+, A0, F 등)을 띄어쓰기로 구분하여 차례로 작성해 주세요.")
        var inputGrade: String? = readLine()
        grade = inputGrade!.components(separatedBy:" ")
        
        if inputGrade == "" || grade.count < 3 || allScores.contains(grade[2].capitalized) == false {
            print("입력이 잘못 되었습니다. 다시 확인해주세요")
        } else if student.contains(grade[0]) && allScores.contains(grade[2].capitalized)  {
            
            if  credit.keys.contains(grade[0] + " " + grade[1].capitalized) {
                print("\(grade[0]) 학생의 \(grade[1].capitalized) 과목이 \(grade[2].capitalized)로 추가(변경) 되었습니다.")
                grade[0] = grade[0] + " " + grade[1].capitalized
                credit.updateValue(grade[2].capitalized, forKey: grade[0])
            } else {
                print("만약에 학생의 성적 중 해당 과목이 존재하면 기존 점수가 갱신됩니다.")
                grade[0] = grade[0] + " " + grade[1].capitalized
                credit[grade[0]] = grade[2].capitalized
            }
            subject.insert(grade[1].capitalized)
        } else if student.contains(grade[0]) == false {
            student.insert(grade[0])
            print("\((grade[0])) 학생을 추가하였습니다.")
            print("\((grade[0])) 학생의 \(grade[2]) 성적을 추가하였습니다.")
            grade[0] = grade[0] + " " + grade[1].capitalized
            credit[grade[0]] = grade[2].capitalized
            subject.insert(grade[1].capitalized)
        }
        grade.removeAll()
    }
    
    else if input == "4" {
        print("성적을 삭제할 학생의 이름, 과목 이름을 띄어쓰기로 구분하여 차례로 작성해주세요.")
        var editGrade: String? = readLine()
        grade = editGrade!.components(separatedBy:" ")
        
        if editGrade == "" || grade.count < 2  {
            print("입력이 잘못 되었습니다. 다시 확인해주세요")
        }
        else if student.contains(grade[0]) && credit.keys.contains(grade[0] + " " + grade[1].capitalized) {
            print(grade[0] + " " + grade[1].capitalized)
            print("\(grade[0]) 학생의 \(grade[1].capitalized) 과목의 성적이 삭제되었습니다.")
            student.remove(grade[0])
            grade.removeAll()
        } else {
            print("\(grade[0]) 학생을 찾지 못했습니다.")
        }
    }
    
    else if input == "5" {
        print("평점을 알고 싶은 학생의 이름을 입력해주세요.")
        var name: String? = readLine()
        
        if name == "" {
            print("입력이 잘못 되었습니다. 다시 확인해주세요")
        } else if student.contains(name!) == false {
            print("\(name!) 학생을 찾지 못했습니다.")
        } else if student.contains(name!) == true {
            let condition: ((String,String)) -> Bool = {
                $0.0.contains(name!)
            }
            var newCredit = credit.filter(condition)
            var exam1 = [String](newCredit.keys)
            var exam2: [String]
            
            for i in 0...exam1.count-1 {
                    exam2 = exam1[i].components(separatedBy: " ")
                    exam1[i] = exam2.remove(at: 1)
            }
            
            var average1 = [String](newCredit.values)
            var average2: [Double] = Array(repeating: 0.0, count: average1.count)
         
            for n in 0...average1.count-1  {
                    switch average1[n] {
                    case "A+" : average2[n] = 4.5
                    case "A0" : average2[n] = 4.0
                    case "B+" : average2[n] = 3.5
                    case "B0" : average2[n] = 3.0
                    case "C+" : average2[n] = 2.5
                    case "C0" : average2[n] = 2.0
                    case "D+" : average2[n] = 1.5
                    case "D0" : average2[n] = 1.0
                    case "F"  : average2[n] = 0.0
                    default : ""
                    }
            }
            
            var total :Double = 0.0
            
            for i in average2 {
                total += i
            }
            
            var finalCredit = total/Double(exam1.count)
            
            for b in 0...exam1.count-1 {
                print("\(exam1[b].capitalized) : \(average1[b])")
            }
            print("평점 : \(round(finalCredit*100)/100)")
    
        }
    }
        else {
            print("입력이 잘못 되었습니다. 1~5 사이의 숫자 혹은 X를 입력해주세요.")
        }
        
        input = ""
        print("""
        원하는 기능을 입력해주세요.
        1: 학생추가, 2: 학생삭제, 3: 성적추가(변경), 4: 성적삭제, 5: 평점보기, X: 종료
        """)
        input = readLine()
}
print("프로그램을 종료합니다.")
