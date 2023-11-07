import UIKit

var greeting = "Hello, playground\n hi"

print(greeting)
//ㄴadsklfj
//kasjdf;lkjasklf;
//dsafdsaf


/*
jㅏㅁㄴ얼;ㅏㅇ먼ㄹ
ㅁㄴ알ㅇㄴㅁ;ㅓ리ㅏㅓㅇㅁㄴ
ㅓㅁ나ㅣㅇ러ㅏㅣ;ㄴㅇ러
*/

//1. 회원가입: 닉네임, 이메일, 나이, 평정, 성별
var nickname = "jacob"
let email = "a@a.com"
var age = 40
var rate = 4.1 //Int? Double?
var gender = false // true: 남자, false: 여자

print("안녕하세요! 저는 \(nickname) 입니다. 평점은 \(rate)점이에요. 나이는 \(age)살이에요")


age = 50
rate = 4.4
nickname = "고래밥"
//email = "oooooo"

print("안녕하세요! 저는 \(nickname) 입니다. 평점은 \(rate)점이에요. 나이는 \(age)살이에요")

//2. WhoAmI: 년도, 날짜, 끼니, 잠자는 시간

var birth = 1999
var day = (2023 - birth) * 365
//var rice: Int = day * 3
//var sleep: Int = day * 8

print("""
저는 \(birth)년에 태어났고
지금까지 \(day)일 째 살고 있습니다.
지금까지 밥은 \(day * 3)끼를 먹었고
\(day * 8)시간 잤습니다
""")
 

