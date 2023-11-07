

func findNumber() { // 이름, 기능, 실행타이밍 직접!
                    // option + command + 방향키 왼쪽 : 내용 숨기기

    // 1. 4의 배수와 6의 배수를 찾는 기능
    // % : Percent Sign , { } Brace , [ ] : Bracket

    var randomNumber = [1, 4, 7, 12, 55, 35, 18, 36, 79]

    for num in randomNumber {
        if num % 4 == 0 && num % 6 == 0 {
            print(num)
        }
    }

}

//findNumber() // 호출해야함!

func bestScore() {
    // 300점 만점에 200점 이상 우수
    let score = [180, 270, 90, 120, 240, 300]
    
    //var best: [Int] = []
    var best: Int = 0
    
    for i in score {
        if i >= 200 {
            //best.append(i)
            best = best + 1
        }
    }
    
    //print("우수자는 총 \(best.count)명입니다!")
    print("우수자는 총 \(best)명입니다!")
}

//bestScore()

func welcomeMessage(nickname: String) { // 매개변수
    
    print("안녕하세요! \(nickname)님, 반갑습니다")
    
}

welcomeMessage(nickname: "칙촉")

print(1)
print(2)

welcomeMessage(nickname: "카스타드")

func changeProgram(money: Int, product: Int) {

    let change = money - product

    //500원과 100원만 가능, 10원 단위의 돈
    let rest500 = change / 500
    let rest100 = (change % 500) / 100
     
    print("거스름돈 \(change)원을, 500원 \(rest500)개, 100원 \(rest100)개로 거슬러 주겠습니다.")
    
}

changeProgram(money: 5000, product: 3800)
changeProgram(money: 2000, product: 100)

func calculateWater(height: Int, weight: Double) {

    let waterGuide = (Double(height) + weight) / 100 //height 형변환

    print("하루 물 권장 섭취량은 \(waterGuide)L 입니다")
    
}

calculateWater(height: 180, weight: 80)
calculateWater(height: 165, weight: 60)
