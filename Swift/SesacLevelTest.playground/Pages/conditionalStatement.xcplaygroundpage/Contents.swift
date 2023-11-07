
// 여성? 남성?

let gender = false

if gender == true {
    print("저는 여성입니다.")
} else {
    print("저는 남성입니다.") // 예외처리
}

switch gender {   // 불리언 타입은 모든 경우를 대응하기 때문에 default 안 써도 무방
case true: print("저는 여성입니다.")
case false: print("저는 남성입니다.")
}
 
// 수화물 요금 안내
//let weight = Int.random(in: 1...20)
//
//if weight > 15 {
//    print("\(weight)kg로 수화물 요금을 내셔야 해요")
//} else {
//    print("\(weight)kg로 수화물 요금을 무료입니다")
//
//}

// 회원가입
let age = Int.random(in: 1...100)

if age >= 14 {  // 반드시 부등호 앞쪽을 바꿔줘야함
    print("당신은 \(age)살이므로, 부모님 동의 없이 가입할 수 있습니다.")
} else {
    print("당신은 \(age)살이므로, 부모님 동의가 필요합니다.")
}

// TV 프로그램 추천
let select = "영화"

//if select == "드라마" {
//    print("오늘의 드라마 '태양의 후예'를 추천드립니다.")
//}

if select != "드라마" {    // 반드시 부등호 앞쪽을 바꿔줘야함
    print("오늘의 영화 '범죄도시3'를 추천드립니다.")
} else {
    print("오늘의 드라마 '태양의 후예'를 추천드립니다.")
}

// 성적 장학금 추천
var gradePoint = 4.4

//gradePoint = 3.4

if gradePoint <= 4.3 {
    print("아쉽지만 장학금 대상이 아니에요")
} else {
    print("장학금 대상이에요. 축하합니다.")
}

// 닉네임 설정

let userNickname = "제이콥"

if userNickname == "바보" || userNickname == "말미잘" || userNickname == "현금" { // ||: 또는
    print("이 닉네임은 사용할 수 없어요")
} else {
    print("이 닉네임은 사용 가능해요")
}

let blackList = ["바보", "말미잘", "해삼", "현금", "번호"]

if blackList.contains(userNickname) == true { // == true 는 생략이 가능. bool 타입은 생략이 가능하다.
    print("안 됩니다!")
} else {
    print("됩니다!")
}

// 쿠폰 서비스: 0~4, 5~9, 10~19, 20번 이상

let order = 5 // Int.random(in: 0...30)

if order >= 0 && order <= 5 {  // 범위가 겹치면 참인 코드를 찾으면 뒤쪽 코드는 실행되지 않는다.
    print("쿠폰 5천원 투척!")
} else if order >= 5 && order < 10 {
    print("쿠폰 만원 투척!")
} else if order >= 10 && order < 20 {
    print("쿠폰 2만원 투척!")
} else if order >= 20 {
    print("쿠폰 5만원 투척!")
} else {
    print("오류 발생! 잠시 후 다시 시도해주세요.") // 만의 하나를 위한 예외 처리
}

switch order {    // if문과의 차이점: if문은 예외처리 else가 없어도 되지만
                  //              switch에서는 default가 없으면 오류 발생(100% 모든 경우의 수에 대응하기 위해) 반드시 예외처리
case 0...4:
    print("쿠폰 5천원 투척!")
case 5...9:
    print("쿠폰 만원 투척!")
case 10...19:
    print("쿠폰 2만원 투척!")
case 20...:
    print("쿠폰 5만원 투척!")
default:
    print("오류 발생! 잠시 후 다시 시도해주세요.")
}

//if order < 5 {
//    print("쿠폰 5천원 투척!")
//} else if order < 10 {
//    print("쿠폰 만원 투척!")
//} else if order < 20 {
//    print("쿠폰 2만원 투척!")
//} else if order >= 20 {
//    print("쿠폰 5만원 투척!")
//}

//if order >= 0 && order <= 5 { // 개별적으로 코드 작성시 참인 값을 찾아도 다음 코드를 계속 실행을 한다. else if는 시간을 번다.
//    print("쿠폰 5천원 투척!")
//}
//
//if order >= 5 && order < 10 {
//    print("쿠폰 만원 투척!")
//}
//
//if order >= 10 && order < 20 {
//    print("쿠폰 2만원 투척!")
//}
//
//if order >= 20  {
//    print("쿠폰 5만원 투척!")
//}


// BMI 계산기
// 몸무게(kg) / 신장(m) * 신장(m)
// 18.5 이하는 저체중, 18.5 초과 23 미만 정상, 23 이상 25 미만 과체중, 25이상 비만

let height = 1.60
let weight = 50.0

let bmi = weight / (height * height)

print(bmi)

if bmi <= 18.5 {
    print("저체중")
} else if bmi > 18.5 && bmi < 23 {
    print("정상")
} else if bmi > 23 && bmi < 25 {
    print("과체중")
} else if bmi >= 25 {
    print("비만")
} else {
    print("오류")
}

switch bmi {
case ...18.5: print("저체중")
case 18.5..<23: print("정상") // 미만을 표시할 때는 ..< , ...은 물결표시, 초과는 사용 불가 미만만 사용 가능
case 23..<25: print("과체중")
case 25...: print("비만")
default: print("오류")
}



