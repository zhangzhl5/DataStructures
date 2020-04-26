package design.pattern.proxy.staticproxy;

import design.pattern.proxy.Person;

public class Son implements Person{

	@Override
    public void findLove(){
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}
