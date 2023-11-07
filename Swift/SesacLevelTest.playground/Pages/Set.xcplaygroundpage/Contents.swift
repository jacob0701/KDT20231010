
// 집합 Set
// 배열과 다르게 중복되는 값을 받을 수 없다.
// 배열과 다르게 인덱스가 없다.

let array = [1,1,1,1]
print(array)

let set:Set = [1,1,1,1] // []로 쓰면 보통 배열로 인식, :Set 이라고 해야 집합으로 인식한다.
print(set) // 배열과 다르게 중복인 요소를 하나로 인식

var two: Set = [2,2,2,2,2,2,2,4,5,6,7,7,12]
var three: Set = [3,6,9,12,15,18]

print(two, three)

var jack: Set = ["A","B","C","D","E"]
var minsu: Set = ["A","B","X","Y","P"]

jack.intersection(minsu) //교집합

let union = jack.union(minsu)   //합집합
print(union)
