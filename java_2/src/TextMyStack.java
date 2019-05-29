package com.bittech.hello;

public class TextMyStack {
    /**
     * Created with IntelliJ IDEA.
     * Description: 两个队列实现栈
     * User: GAO BO
     * Date: 2019-05-23
     * Time: 21:02
     */
    public class TestMyStack {
        private MyQueueImpl myQueue1;
        private MyQueueImpl myQueue2;
        private int usedSize;

        public TestMyStack() {
            myQueue1 = new MyQueueImpl();
            myQueue2 = new MyQueueImpl();
            this.usedSize = 0;
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            if (!myQueue1.empty()) {
                myQueue1.add(x);
            } else if (!myQueue2.empty()) {
                myQueue2.add(x);
            } else {
                myQueue1.add(x);
            }
            this.usedSize++;
        }

        /**
         * Removes the element on top of the stack
         * and returns that element.
         */
        public int pop() {
            int data = 0;
            if (!myQueue1.empty()) {
                for (int i = 0; i < this.usedSize - 1; i++) {
                    myQueue2.add(myQueue1.poll());
                }
                data = myQueue1.poll();
            } else {
                for (int i = 0; i < this.usedSize - 1; i++) {
                    myQueue1.add(myQueue2.poll());
                }
                data = myQueue2.poll();
            }
            this.usedSize--;
            return data;
        }

        /**
         * Get the top element.
         */
        public int top() {
            int data = 0;
            if (!myQueue1.empty()) {
                for (int i = 0; i < this.usedSize; i++) {
                    data = myQueue1.poll();
                    myQueue2.add(data);
                }
            } else {
                for (int i = 0; i < this.usedSize; i++) {
                    data = myQueue2.poll();
                    myQueue1.add(data);
                }
            }
            return data;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return this.usedSize == 0;
        }
    }
}
