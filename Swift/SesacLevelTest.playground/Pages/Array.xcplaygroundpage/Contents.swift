
//6. 영화 갯수, 러닝타임, 장르, 평점
let count:Int = .random(in: 1...200)
//.random(in: 1...100)
let runtime = count * 120
let genrelist = ["로맨스", "SF", "스릴러", "액션", "코미디"]
let genre = genrelist.randomElement()! // ! 로 옵셔널 해결하기
//let genre = genrelist[3]
//let genre = genrelist[100] //런타임 오류 발생
let rate:Double = .random(in: 1...5)

/*
print("""
당신의 총 \(count) 개의 영화를 보았고,
총 러닝 타임은 \(runtime) 분 입니다.
좋아하는 장르는 \(genre) 이며
지금까지 총 영화 평점은 \(rate) 입니다
""")
*/
 
//7. 최근 검색어
//var searchList = []
var searchList: [String] = []

print(searchList)

//print(searchList[2]) // 런타임 오류(배열이 비어있기 때문)

searchList.insert("원피스", at: 0)
searchList.insert("신발", at: 0)
searchList.insert("양말", at: 1)
searchList.append("바지")
searchList.append(contentsOf: ["시계", "목걸이", "반지"])
 
print(searchList)

print(searchList[2])

searchList[6] = "팔찌"

searchList.remove(at: 4)
searchList.removeAll()

print(searchList)

//8. 2차원 배열

let sample: [[Int]] = [[1,2,3],[4,5,6],[10,7],[5,8,9,55]] //Int배열을 요소로 가지는 배열

sample.count // 요소가 몇개인지 알고 싶을 때
let result = sample[3]

result[2]
sample[3][2] //위와 같은 뜻!!
print(sample[3][2])

