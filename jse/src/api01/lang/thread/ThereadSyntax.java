package api01.lang.thread;
/*
 * 6.2
 * 1번
 * Program : 특정 기능을 처리하기 위해 프로그래밍 언어를 통해
 * 함수, 메소드, 프로시저, 루틴 등을 모아 놓은 것
 * 프로세스(Process) : Thread 의 집합으로 하나의 exe, com, dll 프로그램을 뜻함.
 * Process 간 자원(memory = resource)를 공유할 수 없다.
 * 따라서 Process 를 많이 발생시키면 자원이 바닥남
 * */
/*
 * Thread
 * 반복적으로 동기화하여 실행되는 프로그램 루틴
 * 메소드 단위의 처리 모듈 Process 의 구성요소
 * Thread 는 많이 발생해도 자원을 공유함으로써
 * Process 에 비해 시스템 부담이 적음
 * */
/*
 * 스레드를 구현하는 방법
 * 1. Thread 클래스를 상속하는 방법
 * 2. Runnable 인터페이스를 구현하는 방법
 * -객체지향적인 방법은 인터페이스 구현방법을 취하는 게 낫다.
 * - Runnable 구현방법을 추천
 * */
/*
 * 스레드 콜백 메소드
 * - start() : JVM 이 스케쥴 상 여유가 생겼을 때, 스레드 스케쥴상 RUN() 을 호출
 * - run() : 스레드 상태에서 처리하려고 하는 모든 비즈니스 로직이 구현됨
 * - sleep(long milisecond) : 지정된 시간동안 스레드를 쉬게 하고,
 * 그 시간이 지나면 다시 작동한다. 1000분의 1초
 * - wait() : 현재 스레드 무한대기. notify(), notifyAll() 메소드로 재실행시킴
 * - suspend() : 일시정지, 재실행은 resume()
 * - yield() : 스레드 실행권한을 다른 스레드에 넘김
 * - stop() : 스레드 실행을 종료
 * */
/*단일 스레드
 * - 하나의 자바 프로그램을 실행하는 상태
 * - main() 이 대표적인 싱글 스레드
 * 멀티 스레드
 * - 하나의 메소드가 실행하는 상태가 아닌
 * - 여러 메소드가 지속적으로 자원 공유상태에서 실행하는것
 * 
 * */
/*
 *콜백 메소드
 *- 메소드를 일정 실행순서에 따라 미리 등록시켜 놓고
 *- 등록된 순서에 따라 자동적으로 호출하는 메소드 
 * */
/*
 * 교착상태 (Dead lock)
 * - 두 스레드가 lock 을 건 상태에서
 * 	서로 lock 이 풀리기를 기다리는 상황으로
 * 	작업(task) 이 진행되지 않고 ㅡ 영원히 기다리게 되는 상황
 * -프로그래머는 변수와 while 문, if문을 사용해서 스레드를 제어해야한다.
 * 
 * */
public class ThereadSyntax {

}