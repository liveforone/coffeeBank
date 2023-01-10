# Coffee Bank
> 온라인 간편 은행 서비스

# 1. 사용 기술 스택
* Spring Boot 3.0.1
* Language : Java17
* DB : MySql
* ORM : Spring Data Jpa
* Spring Security
* LomBok
* Gradle
* jwt(api, impl, jackson)
* Junit5
* Apache Commons lang3

# 2. 설명


# 3. 설계


## API 설계
### users
```
```

## json body 설계 및 예시
### users
```
[일반 유저]
{
    "email" : "yc1234@gmail.com",
    "password" : "1234"
}
[어드민]
{
    "email" : "admin@libreria.com",
    "password" : "1234"
}
[비밀번호 변경]
{
    "oldPassword" : "1234",
    "newPassword" : "1111"
}
```

# 4. ER Diagram

# 5. 스타일 가이드
* 함수와 긴 변수의 경우 [줄바꿈 가이드](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/b.%20%EC%A4%84%EB%B0%94%EA%BF%88%EC%9C%BC%EB%A1%9C%20%EA%B0%80%EB%8F%85%EC%84%B1%EC%9D%84%20%ED%96%A5%EC%83%81%ED%95%98%EC%9E%90.md)를 지켜 작성하라.
* 유저를 제외한 모든 객체의 [널체크](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/c.%20%EA%B0%9D%EC%B2%B4%EC%9D%98%20Null%EA%B3%BC%20%EC%A4%91%EB%B3%B5%EC%9D%84%20%EC%B2%B4%ED%81%AC%ED%95%98%EB%9D%BC.md) + 중복 체크를 꼭 하라.
* 분기문은 반드시 [게이트웨이](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/d.%20%EB%B6%84%EA%B8%B0%EB%AC%B8%EC%9D%80%20gate-way%20%EC%8A%A4%ED%83%80%EC%9D%BC%EB%A1%9C%20%ED%95%98%EB%9D%BC.md) 스타일로 하라.
* [Mapper 클래스](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/e.%20Mapper%20%ED%81%B4%EB%9E%98%EC%8A%A4%EB%A5%BC%20%EB%A7%8C%EB%93%A4%EC%96%B4%20Entity%EC%99%80%20Dto%EB%A5%BC%20%EC%83%81%ED%98%B8%20%EB%B3%80%ED%99%98%ED%95%98%EB%9D%BC.md)를 만들어 entity와 dto를 상호 변환하라.
* 단순 for-each문은 [람다](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/f.%20%EB%8B%A8%EC%88%9C%20for-each%EB%AC%B8%EC%9D%84%20%EB%9E%8C%EB%8B%A4%EB%A1%9C%20%EB%B0%94%EA%BE%B8%EC%9E%90.md)로 바꿔라.
* 매직넘버는 전부 [enum](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/h.%20%EB%A7%A4%EC%A7%81%EB%84%98%EB%B2%84%EB%A5%BC%20enum%EC%9C%BC%EB%A1%9C%20%ED%95%B4%EA%B2%B0%ED%95%98%EB%9D%BC.md)으로 처리하라.
* 스프링 시큐리티에서 권한 체크 필요한것만 매핑하고 나머지(anyRequest)는 authenticated 로 설정해 코드를 줄이고 가독성 향상하라.
* [Utils 클래스](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/i.%20Util%20%ED%81%B4%EB%9E%98%EC%8A%A4%EB%A5%BC%20%EB%A7%8C%EB%93%A4%EC%96%B4%20%ED%8E%B8%EC%9D%98%EC%84%B1%EC%9D%84%20%EB%86%92%EC%97%AC%EB%9D%BC.md)를 적극 활용하고, 서비스로직에서 트랜잭션이 걸리지 않는 로직은 Utils 클래스에 담아서 모듈화하라.
* [네이밍은 직관적이게 하라](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/j.%20%EB%84%A4%EC%9D%B4%EB%B0%8D%EC%9D%80%20%EC%A7%81%EA%B4%80%EC%A0%81%EC%9D%B4%EA%B2%8C%20%ED%95%98%EB%9D%BC.md)
* 주석은 c언어 스타일 주석으로 선언하라.
* [함수 규칙](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/k.%20%ED%95%A8%EC%88%98%20%EA%B7%9C%EC%B9%99.md)을 지켜라.
* [좋은 테스트 코드 작성법](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/l.%20%EC%A2%8B%EC%9D%80%20%ED%85%8C%EC%8A%A4%ED%8A%B8%20%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0.md)
* [양방향 연관관계를 지양하라](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/m.%20%EC%96%91%EB%B0%A9%ED%96%A5%20%EC%97%B0%EA%B4%80%EA%B4%80%EA%B3%84%EB%A5%BC%20%EC%A7%80%EC%96%91%ED%95%98%EB%9D%BC.md)
* [시간적인 결합이 있다면 명시하라](https://github.com/liveforone/study/blob/main/%5B%EB%82%98%EB%A7%8C%EC%9D%98%20%EC%8A%A4%ED%83%80%EC%9D%BC%20%EA%B0%80%EC%9D%B4%EB%93%9C%5D/n.%20%EC%8B%9C%EA%B0%84%EC%A0%81%EC%9D%B8%20%EA%B2%B0%ED%95%A9%EC%9D%84%20%EB%AA%85%EC%8B%9C%ED%95%98%EB%9D%BC.md)

account(계좌번호 발급)
간편 결제(계좌 번호 화면에 리턴, 바코드를 qr을 찍으면 결제완료)
이자제도(매달 25일날에 모든 계좌에 0.02%이자 붙어서 리턴, 매달 부여)
결제에 중심된 간편 은행이라고 생각하면된다.
결제시 비밀번호 3번 틀리면 계정 일시정지
알림을 구현해보자.(어드민이 문자를 작성해서 post하면 모든 멤버의 알림창에 남는 로직으로..)
간편결제시
가게명, 시간, 가격, 결제여부(state)
결제시 수수료 300원
atm에서 넣는 이체
atm에서 뽑는 출금(6시 이후에 수수료 300원)
송금
알림에 매일새벽 1시에 점검알림남기기
돈관련 행동을 하면 알림에 기록
숫자는 enum을 적극활용하라

[스케줄러]
1. 조건절에 만료시간이 오늘인 것만 가져와서 아침 11시에 state 만료로 변경 
스케줄러 같은 것은 서비스나 누군가를 호출해서 사용하는 의존관계가 있는 객체임.
의존관계가 있다면 빈으로 등록해서 사용하는 것이 맞겠지만
그렇지 않은 유틸 클래스 같은 객체는 static 메서드로 사용하는 것이 좋다.(성능상)
그런데 보통이 스케줄러는 서비스 로직에서 많이 쓸것같다.
직접 클래스를 만들어 쓰기보단 말이다. 서비스, 리파지토리, 컨트롤러의 경우 해당 어노테이션들에
@Component가 붙어있다. 즉 컴포넌트 스캔을 하기 때문에 @Component를 붙이지않고 
그냥 @Scheduled 어노테이션만 붙여서 사용하면된다. 그게 아닌 즉 스프링 컨테이너가 관리하지 않는 클래스의 경우에는 
@Component 를 붙여서 컴포넌트 스캔을 하여 스프링 컨테이너에 빈으로 등록하도록 해야한다.

[트랜잭션 주의]
트랜잭션은 이체와 같은 부분에서는 특히 더 중요하다.
aService와 bService가 있을때 컨트롤러에서 둘을 호출해 사용하면
a가 에러가 떠 rollback된다고 b도 그렇게 되진 않는다.
따라서 이런 이체 같은경우에는 리파지토리도 같은 것을 쓰기때문에
하나의 트랜잭션(하나의 transactional이 걸린 함수)에서 
원하는 만큼 리파지토리를 통한 쿼리 작업을 하는 방식을 써야한다.
[컨트롤러]
이체Service.이체();
[서비스]
@Transactional
이체() {
	이체Repository.plusMoney();
	이체Repository.minusMoney();
}

put/delete 매핑 후에는 리다이렉트하지말고 메세지만 쏜다.