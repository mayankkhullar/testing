public class Collections {

  static void pushup(Stack st , int a)
  {
          st.push(new Integer (a));
          System.out.println("pushed" +st);
  }
  static void popdown(Stack st)
  {
          Integer a = (Integer) st.pop();
          System.out.println("popped "+a);
  }
public static void main(String[] args) {
          Stack st = new Stack();
          pushup(st,1);
          pushup(st,2);
          pushup(st,3);
          pushup(st,4);
          popdown(st);
          try
                  {
                              popdown(st);
                              }catch(EmptyStackException et)
                              {System.out.println(et);}

    }
}
