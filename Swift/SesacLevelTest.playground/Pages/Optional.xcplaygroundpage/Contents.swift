
var number = [1,2,3,4,5]

number.removeAll()

//print(number.randomElement())
//print(number.randomElement()!) // !을 쓰는건 조심

let result = number.randomElement()

if result == nil {
    print("오류가 발생했어요!")
} else {
    print(result!, result)
}

//number.removeAll()
//
//print(number.randomElement())
//
//
//var age = "13안녕"
//
//print( Int(age) )

