package dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int id;
    @Autowired
    private MathCheat mathCheat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MathCheat getMathCheat() {
        return mathCheat;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    // Method
    public void cheating()
    {

        System.out.println("My ID is: " + id);

        mathCheat.mathCheating();
    }
}
