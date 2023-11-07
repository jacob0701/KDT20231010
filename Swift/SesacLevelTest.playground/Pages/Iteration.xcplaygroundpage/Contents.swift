
// 음악 차트

var musicList = ["좋은 날", "잔소리", "Dynamite", "OMG"]

/*
 1위: 좋은날
 2위: 잔소리
 3위: Dynamite
 4위: OMG
*/

//for music in musicList {
//    print("1위: \(music)")
//}

musicList.append("Hype Boy")
musicList.append("아로하")
print(musicList)

for music in 0...musicList.count - 1 {
    print("\(music + 1)위: \(musicList[music])")
}

//for sesac in 1...100 {        // sesac 은 임시변수!
//    print("\(sesac)입니다.")
//}


