package practice.questions.stringNumberMath;

public class Dummy {
    private Dummy(){
    }

    public static void main(String[] args) {
        System.out.println("there");
        try {
            MyImmutable immutable=new MyImmutable();
        } catch (MyException e) {
            System.out.println("inside exception");
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("nopeoooooooooooooooooooooo");
        }
        finally {
            System.out.println("here");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

class MyImmutable{
    Object myImmutable;
    public MyImmutable() throws MyException {
        myImmutable=new Object();
        myImmutable=null;
        if(myImmutable==null){
            throw new MyException();
        }
    }

    public Object getObject() throws MyException {
        if(myImmutable==null){
            throw new MyException();
        }
        return myImmutable;
    }

}
