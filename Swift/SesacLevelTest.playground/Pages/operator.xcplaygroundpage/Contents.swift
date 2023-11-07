
//3. 거스름돈 계산기 (그리디 알고리즘)
//5000원 - 4100원 = 900원 > 500원 1개 100원 4개
//10000원 - 3600원 = 6400원 > 5000원 1장, 1000 1장, 100 4장

let a = 10.0
let b = 3.0

print(a + b)
print(a - b)
print(a * b)
print(a / b) //Int 일때 몫
//print(a % b) //Int 일때 나머지 (Double 일 때는 의미없음)

let money = 2000
let product = 800

let change = money - product

//500원과 100원만 가능, 10원 단위의 돈
let rest500 = change / 500
let rest100 = (change % 500) / 100
 
print("거스름돈 \(change)원을, 500원 \(rest500)개, 100원 \(rest100)개로 거슬러 주겠습니다.")


//4. 영화 러닝타임 계산기
let runtime = 2164 // 1일  3시간 30분
let day = runtime / (60 * 24)
let hour = runtime % (60 * 24) / 60
let minute = runtime % (60 * 24) % 60

print("영화를 지금까지 \(day)일 \(hour)시간 \(minute)분을 보았습니다")


//5. 물 권장 섭취량 계산기: 키+몸무게 / 100
let height: Int = 173
let weight: Double = 70.3

let waterGuide = (Double(height) + weight) / 100

print("하루 물 권장 섭취량은 \(waterGuide)L 입니다")

let test = 100

print(type(of: test))

let testToString = String(test)

print(type(of: test))
