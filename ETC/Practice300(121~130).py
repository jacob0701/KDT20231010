
# 121

# num = input("문자 한개를 입력하세요: ")

# if num.islower:
#     print(num.upper())
# else:
#     print(num.lower())

# 122 

# score = int(input("점수를 입력하세요: "))

# if 81 <= score <= 100:
#     print("grade is A")
# elif 61 <= score <= 80:
#     print("grade is B")
# elif 41 <= score <= 60:
#     print("grade is C")
# elif 21 <= score <= 40:
#     print("grade is D")
# elif 0 <= score <= 20:
#     print("grade is E")
# else:
#     print("잘못 입력하였습니다.")

# 123 

# a,b= input("통화와 통화량을 입력하세요?(ex:100 달러) ").split(' ')
# print(a,b)

# if b == "달러":
#     print("%.2f 원" %(int(a)*1167))
# elif b == "엔":
#     print("%.2f 원" %(int(a)*1.096))
# elif b == "유로":
#     print("%.2f 원" %(int(a)*1268))
# elif b == "위안":
#     print("%.2f 원" %(int(a)*171))

# 124 
 
# num1,num2,num3 = input("숫자를 3개 입력하세요. ").split(",")

# num1 = int(num1)
# num2 = int(num2)
# num3 = int(num3)

# print(max(num1,num2,num3))

# 125 

# phone_number = input("휴대전화 번호 입력: ")
# first_number = phone_number.split("-")

# if first_number[0] == "011":
#     print("당신은 SKT 사용자입니다.")
# elif first_number[0] == "016":
#     print("당신은 KT 사용자입니다.")
# elif first_number[0] == "019":
#     print("당신은 LGU 사용자입니다.")
# else :
#     print("알 수 없음.")

# 126

# area = input("우편번호: ")
# area = area[:3]
# if area in ["010","011","012"]:
#     print("강북구")
# elif area in ["013","014","015"]:
#     print("도봉구")
# else:
#     print("노원구")

# 127 

# resident_number = input("주민등록번호: ")

# if resident_number[7] == "1" or resident_number[7] == "3":
#     print("남자")
# else: 
#     print("여자")

# 128

# resident_number = input("주민등록번호: ")
# resident_number = resident_number.split("-")[1]
# district = resident_number[1:3]
# seoul = ["00","01","02","03","04","05","06","07","08"]

# if district in seoul:
#     print("서울입니다.")
# else:
#     print("서울이 아닙니다.")

# 129

# resident_number = input("주민등록번호: ")
# inspect_number = []
# inspect_number1 = resident_number.split("-")[0]
# inspect_number2 = resident_number.split("-")[1]

# numbers = []

# for i in range(0,6):
#     a = int(inspect_number1[i])*(i+2)
#     numbers.append(a)

# b = int(inspect_number2[0])*8 
# numbers.append(b)
# b = int(inspect_number2[1])*9
# numbers.append(b)

# for x in range(0,4):
#     c = int(inspect_number2[x+2])*(x+2)
#     numbers.append(c)

# sum_list = sum(numbers)
# sum_list = sum_list % 11
# sum_list = sum_list - 7

# if sum_list == int(inspect_number2[6]):
#     print("유효한 주민등록번호입니다.")
# else: 
#     print("유효하지 않은 주민등록번호입니다.")

# 130 (딕션 불러오기 오류)

# import requests
# btc = requests.get("https://api.bithumb.com/public/ticker/").json()['data']

# print(btc)




