
//학번 관리
var students: [Int: String] = [101: "홍길도", 102: "김철수"] // 키 : 밸류

print(students)

students[103] = "김민수" //추가

print(students)

students[101] = "김영희" //수정
students.updateValue("고래밥", forKey: 101) //수정 방법2

students.removeValue(forKey: 102) //삭제

print(students)


//해시태그 관리
var hashtag: [String: Int] = ["영화명대사": 10000, "영화스타그램": 4000, "영화글귀": 2500]

