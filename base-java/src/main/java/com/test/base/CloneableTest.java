package com.test.base;

import org.junit.Test;

import javax.jws.soap.SOAPBinding;

/**
 * 浅拷贝:浅拷贝会在堆上创建一个新的对象（区别于引用拷贝的一点），不过，如果原对象内部的属性是引用类型的话，
 * 浅拷贝会直接复制内部对象的引用地址，也就是说拷贝对象和原对象共用同一个内部对象。
 */
public class CloneableTest {

    public class Address implements Cloneable{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address() {
        }

        public Address(String name) {
            this.name = name;
        }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    public class Person implements Cloneable {
        private Address address;

        public Person() {
        }

        public Person(Address address) {
            this.address = address;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public Person clone() {
            try {
                Person person = (Person) super.clone();
                return person;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }

    }
    @Test
    public void test(){
        Person person1 = new Person(new Address("武汉"));
        System.out.println(person1);
        Person person1Copy = person1.clone();
        System.out.println(person1Copy);
        // true
        Address address = person1.getAddress();
        Address address1 = person1Copy.getAddress();
        System.out.println(address);
        System.out.println(address1);
        System.out.println(person1.getAddress() == person1Copy.getAddress());

    }


}
