public class ApplicationClass {

    public static void main(String[] args) {
        DrawingProgram drawingProgram = new DrawingProgram();
//        drawingProgram.renderAnimation(new RocketShip());
//        drawingProgram.renderAnimation(new StaticShapeDrawer());
//        drawingProgram.renderAnimation(new Animator());
        drawingProgram.renderAnimation(new Game());
    }

}
