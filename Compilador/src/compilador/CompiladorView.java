/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador;



import java.awt.Color;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class CompiladorView extends javax.swing.JFrame {

    /**
     * Creates new form CompiladorView
     */
    TokensView tv = new TokensView();//PARA ACCEDER A A LA TABLA DE TOKENSVIEW
    Object [] fila=new Object[2];//PODER AGREGAR FILAS A LA TABLA
    String cadAux;//AQUI ESTA LA EXPRESION COMPLETA CON EL PUNTO 
    String tablasValidas[] = {"alumnos","profesores","notas","cursos"};
    String tablaLexico[] = {"SELECCIONAR","PALABRA_RESERVADA",
                              "TABLA","PALABRA_RESERVADA",
                              "ATRIBUTOS","PALABRA RESERVADA",
                              ".","SIMBOLO",
                              ",","SIMBOLO"};
    int cantTokens;
    String[] tokensEntrada;
    String cadena;
    
    public CompiladorView() {
        initComponents();
        
     
        

       /* //Color JPanel
        jLabel1.setBackground(Color.white);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnejemplo = new javax.swing.JButton();
        btnejecutar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtexpresion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultados = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setOpaque(true);
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ANALIZADOR LÉXICO, SINTÁCTICO Y SEMÁNTICO");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnejemplo.setBackground(new java.awt.Color(0, 153, 153));
        btnejemplo.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        btnejemplo.setForeground(new java.awt.Color(255, 255, 255));
        btnejemplo.setText("EJEMPLOS");
        btnejemplo.setBorder(null);
        btnejemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejemploActionPerformed(evt);
            }
        });

        btnejecutar.setBackground(new java.awt.Color(0, 153, 153));
        btnejecutar.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        btnejecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnejecutar.setText("EJECUTAR");
        btnejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejecutarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        txtexpresion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), null));
        txtexpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexpresionActionPerformed(evt);
            }
        });

        txtresultados.setColumns(20);
        txtresultados.setRows(5);
        txtresultados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), java.awt.Color.lightGray));
        jScrollPane1.setViewportView(txtresultados);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EDITAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VER TOKENS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Sharon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnejemplo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                            .addComponent(txtexpresion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnejemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtexpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejecutarActionPerformed
        
//Cadena a ser analizada
       //***********************String cadena = "SELECCIONAR TABLA alumnos.";****************************
        cadena = txtexpresion.getText();
                
        //Guardara el token actualmente leido
       int tam = cadena.length();
        
       String delimitador = cadena.substring(tam-1);
       if (delimitador.equals("."))
       {
        cadena = cadena.substring(0,tam-1);
        cadAux = cadena + " .";
        
        String tokenActual;
 
        StringTokenizer st = new StringTokenizer(cadena);

        //Guarda el primer token
        tokenActual = st.nextToken();
         
        //Convertimos toda la cadena a MAYUSCULAS para hacerla case insensitive
        // (NO sensible a las mayusculas/minusculas)
        tokenActual = tokenActual.toUpperCase();
         
        //EMPEZAMOS POR REVISAR EL PRIMER TOKEN
        if( tokenActual.equals ("SELECCIONAR"))
        {
                analizarOperacionSeleccionar(cadena);
        }
        else
            txtresultados.setText("No es una operacion SQL valida, solo se permite SELECCIONAR");
      }
       else
            txtresultados.setText("Se esperaba un PUNTO FINAL para terminar la expresión");
     //Fin del metodo main()
        txtexpresion.setEditable(false);
    }//GEN-LAST:event_btnejecutarActionPerformed

    private void txtexpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexpresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexpresionActionPerformed

    private void btnejemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejemploActionPerformed
       txtexpresion.setText("SELECCIONAR TABLA alumnos ATRIBUTOS dni,nombres,apellidos.");
    }//GEN-LAST:event_btnejemploActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       txtexpresion.setText("");
       txtresultados.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtresultados.setText("");
        txtexpresion.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tv.setVisible(true);// HACER VISIBLE LA VENTANA DE TOKENVIEW
        analizador_lexico(cadAux);// LLAMA AL METODO QUE HACE EL LEXEMA ENVIANDOLE LA CADENA CON LA EXPRESION COMPLETA
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
     public void analizarOperacionSeleccionar(String cadena)
    {
        StringTokenizer tok1 = new StringTokenizer(cadena);
        int contToken = tok1.countTokens();
        //Guardara el token actualmente leido
        String tokenActual;
         
        //salta el SELECCIONAR (en el main ya se comprobo que si era la palabra SELECCIONAR)
        tok1.nextToken();
        //guarda SEGUNDO token (TABLA)
        tokenActual = tok1.nextToken();
         
        //Comprueba si realmente es la palabra TABLA
        if(! tokenActual.equals ("TABLA") )
        {
            txtresultados.setText("Se esperaba la palabra clave TABLA, no '"+tokenActual+"'");
            return;
        }
         
        //guarda SEGUNDO token (Nombre de la tabla que se desea Seleccionar)
        tokenActual = tok1.nextToken();
         
        //Comprueba si es una tabla valida
        if( ! buscar_tabla(tokenActual) )
        {
            txtresultados.setText ("La tabla '"+tokenActual+"' NO EXISTE o NO es una tabla valida.");
            return;
        }
         
        if(tok1.hasMoreTokens()){
            tokenActual = tok1.nextToken();     //guarda lo de values y todo lo demas
         
        
            //Comprueba si realmente es la palabra VALUES
            if(! tokenActual.equals ("ATRIBUTOS") )
            {
                txtresultados.setText ("Se esperaba la palabra clave ATRIBUTOS, no '"+tokenActual+"'");
                return;
            }
            
            String cadCampos = tok1.nextToken();
            StringTokenizer tok2 = new StringTokenizer(cadCampos, ",");

            while(tok2.hasMoreTokens()){
                txtresultados.append(tok2.nextToken()+"\n");
            }         
        }
        else{
            txtresultados.setText("Se selecciono todos los campos de la tabla "+tokenActual);
            return;
        }
        
    }  // Fin de metodo 
     
   //Devuelve true si la cadena que llega esta dentro de un arreglo de Strings,
   //devuelve  false en caso contrario; busca la tabla que llega dentro de las tablas validas
   public boolean buscar_tabla(String nomTabla)
   {
      for(int i = 0;i< tablasValidas.length;i++)
      {
         if( tablasValidas[i].equals(nomTabla) )
                return true;
      }
      return false;
   }
   
   private void analizador_lexico(String cadena) {
        DefaultTableModel modelo=new DefaultTableModel();
        
        tv.tblDatos.setModel(modelo);
        modelo.addColumn("TIPO DE TOKEN");
        modelo.addColumn("TOKEN");//CREA LA TABLA 
        
       StringTokenizer tEntrada=new StringTokenizer(cadena);//SEPARA EN TOKENS TODA LA EXPRESION
        cantTokens =tEntrada.countTokens();
        tokensEntrada=new String[cantTokens];
        int j=0;
        while(tEntrada.hasMoreTokens()){//GUARDA EN UN VECTOR CADA TOKEN
            String str=tEntrada.nextToken();
            tokensEntrada[j]=str;
            j++; 
        }
        int vf;
        for (int k = 0; k <cantTokens; k++) {
            vf = 0;
            for (int l = 0; l < tablaLexico.length ; l=l+2) 
            {
                System.out.println(tablaLexico[l]);
                if(tokensEntrada[k].equals(tablaLexico[l])){
                    fila[0]=tablaLexico[l+1];
                    fila[1]=tablaLexico[l];
                    modelo.addRow(fila);
                    tv.tblDatos.setModel(modelo);  
                    l=tablaLexico.length;
                    vf = 1;
                }
                else{
                    vf=0;
                }
            }
            if(vf==0){
                        fila[0]="IDENTIFICADOR"; //identificador
                        fila[1]=tokensEntrada[k]; //token
                        modelo.addRow(fila);
                        tv.tblDatos.setModel(modelo);
            }
        }
           }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompiladorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompiladorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompiladorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompiladorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompiladorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnejecutar;
    private javax.swing.JButton btnejemplo;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtexpresion;
    private javax.swing.JTextArea txtresultados;
    // End of variables declaration//GEN-END:variables

    
}
