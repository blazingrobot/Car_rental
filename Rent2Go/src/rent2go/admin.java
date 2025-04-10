/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rent2go;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class admin extends javax.swing.JFrame {

   private static String filepath = "src\\rent2go\\cars.json";
    
    public admin() {
        initComponents();
         loadCarsFromJson();
    }
    
    public static class Car {
        String carCode;
        String model;
        String licensePlate;

        public Car(String carCode, String model, String licensePlate) {
            this.carCode = carCode;
            this.model = model;
            this.licensePlate = licensePlate;
        }
    }

    private void loadCarsFromJson() {
        try (FileReader reader = new FileReader("cars.json")) {
        Gson gson = new Gson();
        
        // Deserialize the entire JSON structure into a map
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        
        // Extract the "cars" array from the JSON object
        JsonArray carsArray = jsonObject.getAsJsonArray("cars");
        
        // Convert the JSON array into a list of Car objects
        List<Car> carList = gson.fromJson(carsArray, new TypeToken<List<Car>>(){}.getType());
        
        if (carList != null) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for (Car car : carList) {
                model.addRow(new Object[]{car.carCode, car.model, car.licensePlate});
            }
        } else {
            System.out.println("No data found in cars.json or invalid JSON format.");
        }
    } catch (IOException e) {
        System.out.println("Error reading cars.json: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error during JSON deserialization: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        carcode = new javax.swing.JTextField();
        carModelField = new javax.swing.JTextField();
        L_plate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("ADMIN");

        jButton1.setText("Add Row");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Code", "Model", "Lisence plate"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Car Code:");

        jLabel3.setText("Model");

        jLabel4.setText("Lisence plate:");

        carcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carcodeActionPerformed(evt);
            }
        });

        carModelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carModelFieldActionPerformed(evt);
            }
        });

        L_plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_plateActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(carcode, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(carModelField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(L_plate, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(33, 33, 33)))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(carcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carModelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_plate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Add the new row to the table
        String carCode = carcode.getText();
        String modelName = carModelField.getText();
        String licensePlate = L_plate.getText();
        model.addRow(new Object[]{carCode, modelName, licensePlate});

        // Save all data to JSON
        saveCarsToJson(); // Use the method you already made

        JOptionPane.showMessageDialog(null, "Data saved to cars.json!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carcodeActionPerformed

    private void carModelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carModelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carModelFieldActionPerformed

    private void L_plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_plateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_plateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }
    
 

// Save table data to JSON
private void saveCarsToJson() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    List<Car> carList = new ArrayList<>();

    // Collect data from the table
    for (int i = 0; i < model.getRowCount(); i++) {
        // Check and print the values from the table before saving
        Object carCodeObj = model.getValueAt(i, 0);
        Object modelNameObj = model.getValueAt(i, 1);
        Object licenseObj = model.getValueAt(i, 2);

        String carCode = carCodeObj != null ? carCodeObj.toString().trim() : "";
        String modelName = modelNameObj != null ? modelNameObj.toString().trim() : "";
        String license = licenseObj != null ? licenseObj.toString().trim() : "";

        carList.add(new Car(carCode, modelName, license));
    }

    // Ensure that data is being added to carList correctly
    System.out.println("Saving the following cars to JSON:");
    for (Car car : carList) {
        System.out.println("Car Code: " + car.carCode + ", Model: " + car.model + ", License Plate: " + car.licensePlate);
    }

    // Create the JSON structure with "cars" field
    JsonObject jsonObject = new JsonObject();
    JsonArray carsArray = new JsonArray();

    // Add car data to the JSON array
    for (Car car : carList) {
        JsonObject carObject = new JsonObject();
        carObject.addProperty("Car_Code", car.carCode);
        carObject.addProperty("Model", car.model);
        carObject.addProperty("License_Plate", car.licensePlate);
        carsArray.add(carObject);
    }

    // Add cars array to the main JSON object
    jsonObject.add("cars", carsArray);

    // Save to file
    try (FileWriter writer = new FileWriter("cars.json")) {
        Gson gson = new Gson();
        gson.toJson(jsonObject, writer);
        System.out.println("Cars saved successfully.");
    } catch (IOException e) {
        System.out.println("Error saving cars: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L_plate;
    private javax.swing.JTextField carModelField;
    private javax.swing.JTextField carcode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
