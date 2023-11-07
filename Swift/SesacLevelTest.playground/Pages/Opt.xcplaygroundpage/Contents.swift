
var name: String? = "고래밥"  //타입 뒤에 ?를 붙이면 옵셔널타입으로 만드는 것(nil값을 가질 수 있는)

name = nil

//print(name)

//1. 100% 문제가 없을 때  !붙이기
//print(name!)

//2. if - else로 해결

if name == nil {
    print("손님")
} else {
    print(name!)
}

//3. nil coalescing ( nil 병합 연산자) ??
print(name ?? "손님")
