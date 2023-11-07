//
//  main.swift
//  practice
//
//  Created by Lacon85 on 2023/08/19.
//

import Foundation

print("Hello, World!")

var student = Set<String>()
var subject = Set<String>()
var credit: (student: String, subject: String, grade: String)
var grade: [String] = []
let allScores: [String] = ["A+","A0","B+","B0","C+","C0","D+","D0","F"]

print("""
원하는 기능을 입력해주세요.
1: 학생추가, 2: 학생삭제, 3: 성적추가(변경), 4: 성적삭제, 5: 평점보기, X: 종료
""")
var input: String? = readLine()

while input != "X" && input != "x"{
    
    if input == "1" {
        print("추가할 학생의 이름을 입력해 주세요.")
        var name: String? = readLine()
        if name == ""  {
            print("입력이 잘못되었습니다. 다시 확인해주세요")
        } else if student.contains(name!) {
            print("\(name!)은(는) 이미 존재합니다. 추가하지 않습니다.")
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
        }
        else if student.contains(name!) {
            student.remove(name!)
            print("\(name!) 학생을 삭제하였습니다.")
        } else if student.contains(name!) == false {
            print("\(name!) 학생을 찾지 못했습니다.")
        }
    }
    
    else if input == "3" {
        print("성적을 추가할 학생의 이름, 과목 이름, 성적(A+, A0, F 등)을 띄어쓰기로 구분하여 차례로 작성해 주세요.")
        var inputGrade: String? = readLine()
        grade = inputGrade!.components(separatedBy:" ")
        
        if inputGrade == "" || grade.count < 3 || allScores.contains(grade[2].capitalized) == false {
            print("입력이 잘못 되었습니다. 다시 확인해주세요")
        }
        else if student.contains(grade[0]) && allScores.contains(grade[2].capitalized) {
        
            print("만약에 학생의 성적 중 해당 과목이 존재하면 기존 점수가 갱신됩니다.")
            //        } else if credit.student == grade[0] && credit.subject == grade[1] &&
            //                    credit.grade != grade[2] {
            //
            //            print("\(grade[0]) 학생의 \(grade[1].capitalized) 과목이 \(grade[2].capitalized)로 추가(변경) 되었습니다.")
            //            print("\((grade[0])) 학생의 \(grade[1].capitalized) 성적을 추가하였습니다.")
            //
            //        }
            print(credit)
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
    
    
    
    
    
    
    

