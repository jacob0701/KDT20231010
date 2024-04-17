import random 
import pprint   # pprint 모듈

groups = ["A조","B조","C조","D조","E조","F조","G조","H조"]

teams = ['카타르','에과도르','세네갈','네덜란드','잉들랜드','이란','미국','웨일스',
         '아르헨티나','사우디','멕시코','폴란드','프랑스','호주','덴마크','튀니지',
         '스페인','코드타리카','독일','일본','벨기에','캐나다','모로코','크루아티아',
         '브라질','세르비아','스위스','카메룬','포르투갈','가나','우루과이','대한민국']

match_tables = {}
for i in range(0,8):
    select = random.sample(teams,k=4)
    match_tables[groups[i]] = select
    for i in range(len(select)):
        teams.remove(select[i])        
pprint.pprint(match_tables)
