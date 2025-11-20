package Tester;

import Lista.Nodo;
import Stack.Stack;

public class StackTester
{
    public static void main(String[] args)
    {
        Stack<Integer> t = new Stack<Integer>();
        t.push(1);
        t.push(2);
        t.push(3);

        t.printStack();

        Nodo<Integer> tmp = t.top();
        t.pop();
        System.out.println("print dello stack dopo la pop");
        t.printStack();
    }
}
