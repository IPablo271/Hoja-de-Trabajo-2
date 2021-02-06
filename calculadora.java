import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class calculadora implements calculadorageneral {
    Stack<Integer> mistack = new StackVector<Integer>();
    ArrayList<String> miarray = new ArrayList<String>();

    @Override
    public String calculo(String expresion) {
        String[] dividido = expresion.split(" ");
        for (String a : dividido)
            miarray.add(a);
        System.out.println(miarray);
        for (int i = 0; i < miarray.size(); i++) {
            System.out.println(miarray.get(i));
            if (isNumeric(miarray.get(i)) == true) {
                int a = Integer.parseInt(miarray.get(i));
                mistack.push(a);
                
            }
            if (evaluate(miarray.get(i)) == true) {
                System.out.println("Entro aca");
                if (miarray.get(i) == "+") {
                    if (mistack.empty() == true) {
                        return "No se puede realizar la operacion debdio a que el array esta vacio";
                    } else {
                        if (mistack.size() >= 2) {
                            int a = mistack.peek();
                            mistack.pop();
                            int b = mistack.peek();
                            mistack.pop();
                            int c = a + b;
                            mistack.push(c);
                        } else {
                            return "No se puede realizar la operacion debido a que no existen suficientes numeros";
                        }
                    }

                }
                if (miarray.get(i) == "-") {
                    if (mistack.empty() == true) {
                        return "No se puede realizar la operacion debdio a que el array esta vacio";
                    } else {
                        if (mistack.size() >= 2) {
                            int a = mistack.peek();
                            mistack.pop();
                            int b = mistack.peek();
                            mistack.pop();
                            int c = a - b;
                            mistack.push(c);
                        } else {
                            return "No se puede realizar la operacion debido a que no existen suficientes numeros";
                        }
                    }

                }
                if (miarray.get(i) == "*") {
                    if (mistack.empty() == true) {
                        return "No se puede realizar la operacion debdio a que el array esta vacio";
                    } else {
                        if (mistack.size() >= 2) {
                            int a = mistack.peek();
                            mistack.pop();
                            int b = mistack.peek();
                            mistack.pop();
                            int c = a * b;
                            mistack.push(c);
                            System.out.println(c);
                        } else {
                            return "No se puede realizar la operacion debido a que no existen suficientes numeros";
                        }
                    }

                }
                if (miarray.get(i) == "/") {
                    if (mistack.empty() == true) {
                        return "No se puede realizar la operacion debdio a que el array esta vacio";
                    } else {
                        if (mistack.size() >= 2) {
                            int a = mistack.peek();
                            mistack.pop();
                            int b = mistack.peek();
                            if (b == 0) {
                                return "No se pudo realizar la operacion debdio a que existe una divison sobre 0";
                            } else {
                                mistack.pop();
                                int c = a / b;
                                mistack.push(c);

                            }
                        } else {
                            return "No se puede realizar la operacion debido a que no existen suficientes numeros";
                        }
                    }

                } else {
                    return "No se pudo encontrar un operador";
                }
            }

        }
        String a=String.valueOf(mistack.peek());
        return a;
    }

    @Override
    public Boolean evaluate(String expresion) {
        if (expresion == "*") {
            return true;
        }
        else if (expresion == "/") {
            return true;
        }
        else if (expresion == "+") {
            return true;

        }
        else if (expresion == "-") {
            return true;
        } else {
            return false;
        }

    }

    public static Boolean isNumeric(String texto) {
        if (texto == null || texto.length() == 0) {
            return false;
        }
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    

}