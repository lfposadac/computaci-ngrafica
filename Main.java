 

public class Main {
    public static void main(String[] args) {
        Matrix4x4 uvnMatrix = new Matrix4x4();
        Vector4 up = new Vector4(-3,3,-3);
        Vector4 u = new Vector4(0,0,-1);
        Vector4 v = new Vector4(0,1,0);
        Vector4 n = new Vector4(1,0,0);

        uvnMatrix.matrix[0][0] = u.getX();
		uvnMatrix.matrix[0][1] = u.getY();
		uvnMatrix.matrix[0][2] = u.getZ();
		
		uvnMatrix.matrix[1][0] = v.getX();
		uvnMatrix.matrix[1][1] = v.getY();
		uvnMatrix.matrix[1][2] = v.getZ();
		
		uvnMatrix.matrix[2][0] = n.getX();
		uvnMatrix.matrix[2][1] = n.getY();
		uvnMatrix.matrix[2][2] = n.getZ();
		
        uvnMatrix.matrix[3][3] = 1;
        
        Vector4 resultado = Matrix4x4.times(uvnMatrix, up);
        System.out.println(resultado.toString());
    }
}
