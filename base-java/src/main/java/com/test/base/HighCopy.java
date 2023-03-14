package com.test.base;

import org.junit.Test;

/**
 * 深拷贝:深拷贝会完全复制整个对象，包括这个对象所包含的内部对象。
 */
public class HighCopy {

    public class Address implements Cloneable{
        private String name;

        public Address(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
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
                person.setAddress(person.getAddress().clone());
                return person;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }

    }
    @Test
    public void test(){
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
        System.out.println(person1);
        System.out.println(person1Copy);
        Address address = person1.getAddress();
        Address address1 = person1Copy.getAddress();
        System.out.println(address);
        System.out.println(address1);
        System.out.println(person1.getAddress() == person1Copy.getAddress());
    }
}
