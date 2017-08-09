/*
 * VIEW
 */
package addressbook;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sd_tutor19
 */
public class AddressBookFrame extends javax.swing.JFrame {

    /* A reference to the ArrayList Manager class, that
     can populate the ArrayList and return it to this frame */
    //private ArrayListManager manager = new ArrayListManager();
    private DatabaseManager manager = new DatabaseManager();

    /* A reference to the array list of address book
     entries created in the ArrayListManager class */
    private ArrayList<AddressBookData> listOfData
            = new ArrayList<>();

    /* The current position in the arraylist */
    private int position;

    public AddressBookFrame() {
        initComponents();
        // That will use the method in the manager class
        // to fill up the ArrayList
        //manager.populateAddressBookList();
        btnSelectAll.doClick();
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
        pnlAddressBookEntries = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnClearAllTextfields = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSelectAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblCurrentRecord = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtLastNameSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Address Book");

        pnlAddressBookEntries.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address Book Entries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), java.awt.Color.blue)); // NOI18N
        pnlAddressBookEntries.setForeground(java.awt.Color.blue);
        pnlAddressBookEntries.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Phone Number:");

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ID:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.setEnabled(false);

        btnClearAllTextfields.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClearAllTextfields.setText("Clear all Textfields");
        btnClearAllTextfields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllTextfieldsActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSelectAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSelectAll.setText("Select All");
        btnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddressBookEntriesLayout = new javax.swing.GroupLayout(pnlAddressBookEntries);
        pnlAddressBookEntries.setLayout(pnlAddressBookEntriesLayout);
        pnlAddressBookEntriesLayout.setHorizontalGroup(
            pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressBookEntriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddressBookEntriesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddressBookEntriesLayout.createSequentialGroup()
                        .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(54, 54, 54)
                        .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAddressBookEntriesLayout.createSequentialGroup()
                        .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(54, 54, 54)
                        .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddressBookEntriesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearAllTextfields)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddressBookEntriesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlAddressBookEntriesLayout.setVerticalGroup(
            pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressBookEntriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddressBookEntriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearAllTextfields, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), java.awt.Color.blue)); // NOI18N

        btnNext.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        btnFirst.setText("<<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lblCurrentRecord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCurrentRecord.setText("0 of 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(btnFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevious)
                .addGap(51, 51, 51)
                .addComponent(lblCurrentRecord)
                .addGap(51, 51, 51)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLast)
                .addGap(125, 125, 125))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrevious});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCurrentRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNext)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrevious});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search for Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), java.awt.Color.blue)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Last Name:");

        txtLastNameSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(53, 53, 53)
                .addComponent(txtLastNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLastNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlAddressBookEntries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAddressBookEntries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAllActionPerformed
        // manager.getAllAddressBookEntries() will retrieve
        // the reference to the newly populated list and
        // assign that reference to the global variable
        listOfData = manager.getAllEntries();

        // Set the list position to 0
        position = 0;

        populateFields();
    }//GEN-LAST:event_btnSelectAllActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // Add one onto the position
        position += 1;

        // If the position reaches the end of the list,
        // reset it to 0
        if (position >= listOfData.size()) {
            position = 0;
        }

        populateFields();
    }//GEN-LAST:event_btnNextActionPerformed

    private void populateFields() {
        if (listOfData == null || listOfData.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No records");
            clearAllFields();
        } else {

            // Get the current element from the Arraylist
            AddressBookData data = listOfData.get(position);
            // Populate the textFields using the getters
            // from data which is an AddressBookData object
            txtId.setText(Integer.toString(data.getId()));
            txtFirstName.setText(data.getFirstname());
            txtLastName.setText(data.getLastname());
            txtEmail.setText(data.getEmail());
            txtPhoneNumber.setText(data.getPhoneNumber());

            // Update the label to reflect the current position in the list
            lblCurrentRecord.setText(position + 1 + " of "
                    + listOfData.size());
        }
    }

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed

        position = 0;

        populateFields();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed

        position--;
        // If the position goes less than one, it is set
        // to the last element in the list (i.e. size - 1)
        if (position < 0) {
            position = listOfData.size() - 1;
        }

        populateFields();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        /* listOfData gets populated from the searchByLastName
         method in the Manager class. That method takes in a
         lastname from the textfield on the form and returns
         an arraylist of address book entries that matches
         that last name. */
        listOfData = manager.searchByLastName(
                txtLastNameSearch.getText());

        position = 0;
        populateFields();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearAllTextfieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllTextfieldsActionPerformed
        clearAllFields();
    }//GEN-LAST:event_btnClearAllTextfieldsActionPerformed

    private void clearAllFields() {
        // Clear the last name search textfields
        txtLastNameSearch.setText("");

        // loop through the centre panel and clear all
        // textfields in it
        for (Component com : pnlAddressBookEntries.getComponents()) {
            if (com instanceof JTextField) {
                ((JTextField) com).setText("");
            }
        }

        // Clear the navigation label
        lblCurrentRecord.setText("0 of 0");
    }
    
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        /* Check that none of the textfields are empty */
        if (txtFirstName.getText().isEmpty()
                || txtLastName.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtPhoneNumber.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "You cannot have empty textfields");

        } else if (txtFirstName.getText().length() > 50) {
            JOptionPane.showMessageDialog(this,
                    "Firstname must be 50 characters or under");
            // requestFocus() clicks/ puts the cursor in the textfield
            txtFirstName.requestFocus();
            txtFirstName.selectAll(); // selects all the text
        } else if (txtLastName.getText().length() > 50) {
            JOptionPane.showMessageDialog(this,
                    "Lastname must be 50 characters or under");
            txtLastName.requestFocus();
            txtLastName.selectAll();
        } else if (txtEmail.getText().length() > 50) {
            JOptionPane.showMessageDialog(this,
                    "Email must be 50 characters or under");
            txtEmail.requestFocus();
            txtEmail.selectAll();
        } else if (txtPhoneNumber.getText().length() > 20) {
            JOptionPane.showMessageDialog(this,
                    "Phone number must be 20 characters or under");
            txtPhoneNumber.requestFocus();
            txtPhoneNumber.selectAll();
        } else {
            /* Call the insert method in the manager class */
            boolean isSuccessful
                    = manager.insert(txtFirstName.getText(),
                            txtLastName.getText(),
                            txtEmail.getText(),
                            txtPhoneNumber.getText());

            if (isSuccessful) {
                /* Show a message box to say it worked */
                JOptionPane.showMessageDialog(this,
                        txtFirstName.getText() + " "
                        + txtLastName.getText() + " was added");
                /* When a item is added to an arraylist, it goes to
                 the end. So, select all records and click on the
                 last button and we will see the new entry. */
                btnSelectAll.doClick();
                btnLast.doClick();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error inserting " + txtFirstName.getText());
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        position = listOfData.size() - 1;

        populateFields();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please select an entry to delete");
        } else {
            boolean isRemoved = manager.delete(
                    Integer.parseInt(txtId.getText()));
            if (isRemoved) {
                JOptionPane.showMessageDialog(this, "Entry was removed");
                
                // populate the arraylist from the manager class
                listOfData = manager.getAllEntries();

                // If I deleted the last entry, the current position
                // will now be the same as the list's size, so
                // move the position back one.
                if (position == listOfData.size()) {
                    position--;
                }
               
                populateFields();

            } else {
                JOptionPane.showMessageDialog(this, "Entry not removed");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "ID is empty, please select an entry to update");
       } 
       /* Check that none of the textfields are empty */
       else if (txtFirstName.getText().isEmpty()
                || txtLastName.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtPhoneNumber.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "You cannot have empty textfields");

        } else if (txtFirstName.getText().length() > 50) {
            JOptionPane.showMessageDialog(this,
                    "Firstname must be 50 characters or under");
            // requestFocus() clicks/ puts the cursor in the textfield
            txtFirstName.requestFocus();
            txtFirstName.selectAll(); // selects all the text
        } else if (txtLastName.getText().length() > 50) {
            JOptionPane.showMessageDialog(this,
                    "Lastname must be 50 characters or under");
            txtLastName.requestFocus();
            txtLastName.selectAll();
        } else if (txtEmail.getText().length() > 50) {
            JOptionPane.showMessageDialog(this,
                    "Email must be 50 characters or under");
            txtEmail.requestFocus();
            txtEmail.selectAll();
        } else if (txtPhoneNumber.getText().length() > 20) {
            JOptionPane.showMessageDialog(this,
                    "Phone number must be 20 characters or under");
            txtPhoneNumber.requestFocus();
            txtPhoneNumber.selectAll();
        } else {
            boolean isSuccessful = 
                    manager.update(Integer.parseInt(txtId.getText()), 
                    txtFirstName.getText(), txtLastName.getText(),
                    txtEmail.getText(), txtPhoneNumber.getText());
            
            if (isSuccessful) {
                /* Show a message box to say it worked */
                JOptionPane.showMessageDialog(this,
                        "Entry updated");
                listOfData = manager.getAllEntries();
                populateFields();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error inserting " + txtFirstName.getText());
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressBookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearAllTextfields;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCurrentRecord;
    private javax.swing.JPanel pnlAddressBookEntries;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastNameSearch;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}