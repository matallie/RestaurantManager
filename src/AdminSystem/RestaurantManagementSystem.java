package AdminSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Canvas;
import java.awt.Button;
import javax.swing.JPanel;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.List;
import java.awt.Checkbox;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;

public class RestaurantManagementSystem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantManagementSystem window = new RestaurantManagementSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RestaurantManagementSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 753, 562);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane MenuTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Menu", null, MenuTab, null);
		
		JSplitPane splitPane = new JSplitPane();
		MenuTab.addTab("Current Items", null, splitPane, null);
		
		JTree MenuTree = new JTree();
		MenuTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Menu Items") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Breakfast");
						node_1.add(new DefaultMutableTreeNode("Item1"));
						node_1.add(new DefaultMutableTreeNode("Item2"));
						node_1.add(new DefaultMutableTreeNode("Item3"));
						node_1.add(new DefaultMutableTreeNode("Item4"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Lunch");
						node_1.add(new DefaultMutableTreeNode("Item1"));
						node_1.add(new DefaultMutableTreeNode("Item2"));
						node_1.add(new DefaultMutableTreeNode("Item3"));
						node_1.add(new DefaultMutableTreeNode("Item4"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Dinner");
						node_1.add(new DefaultMutableTreeNode("Item1"));
						node_1.add(new DefaultMutableTreeNode("Item2"));
						node_1.add(new DefaultMutableTreeNode("Item3"));
						node_1.add(new DefaultMutableTreeNode("Item4"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Salads");
						node_1.add(new DefaultMutableTreeNode("Item1"));
						node_1.add(new DefaultMutableTreeNode("Item2"));
						node_1.add(new DefaultMutableTreeNode("Item3"));
						node_1.add(new DefaultMutableTreeNode("Item4"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Appatizers");
						node_1.add(new DefaultMutableTreeNode("Item1"));
						node_1.add(new DefaultMutableTreeNode("Item2"));
						node_1.add(new DefaultMutableTreeNode("Item3"));
						node_1.add(new DefaultMutableTreeNode("Item4"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Dessert");
						node_1.add(new DefaultMutableTreeNode("Item1"));
						node_1.add(new DefaultMutableTreeNode("Item2"));
						node_1.add(new DefaultMutableTreeNode("Item3"));
						node_1.add(new DefaultMutableTreeNode("Item4"));
					add(node_1);
				}
			}
		));
		splitPane.setLeftComponent(MenuTree);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setLayout(null);
		
		TextArea MenuItemDescriptionText = new TextArea();
		MenuItemDescriptionText.setBounds(10, 38, 628, 160);
		panel.add(MenuItemDescriptionText);
		
		Label label_2 = new Label("Description:");
		label_2.setBounds(10, 10, 71, 22);
		panel.add(label_2);
		
		List MenuItemIngredientList = new List();
		MenuItemIngredientList.setBounds(10, 232, 298, 262);
		panel.add(MenuItemIngredientList);
		
		Label label_3 = new Label("Ingredients:");
		label_3.setBounds(10, 204, 62, 22);
		panel.add(label_3);
		
		TextArea MenuItemDirectionsText = new TextArea();
		MenuItemDirectionsText.setBounds(314, 232, 324, 262);
		panel.add(MenuItemDirectionsText);
		
		Label label_4 = new Label("Directions:");
		label_4.setBounds(314, 204, 62, 22);
		panel.add(label_4);
		
		JPanel AddNewItem = new JPanel();
		MenuTab.addTab("Add New Menu Item", null, AddNewItem, null);
		AddNewItem.setLayout(null);
		
		Button AddItemButton = new Button("Add Item");
		AddItemButton.setBounds(502, 459, 231, 37);
		AddNewItem.add(AddItemButton);
		
		TextField AddItemNameField = new TextField();
		AddItemNameField.setText("Name of Item");
		AddItemNameField.setBounds(10, 10, 208, 22);
		AddNewItem.add(AddItemNameField);
		
		TextArea AddItemDirectionsText = new TextArea();
		AddItemDirectionsText.setBounds(10, 217, 486, 279);
		AddNewItem.add(AddItemDirectionsText);
		
		Label label = new Label("Directions");
		label.setBounds(10, 191, 62, 22);
		AddNewItem.add(label);
		
		Label label_1 = new Label("Ingredients");
		label_1.setBounds(502, 191, 62, 22);
		AddNewItem.add(label_1);
		
		TextArea AddItemIngredientsText = new TextArea();
		AddItemIngredientsText.setBounds(502, 217, 231, 236);
		AddNewItem.add(AddItemIngredientsText);
		
		TextArea AddItemDescriptionText = new TextArea();
		AddItemDescriptionText.setText("Description");
		AddItemDescriptionText.setBounds(10, 38, 723, 145);
		AddNewItem.add(AddItemDescriptionText);
		
		JPanel RemoveItem = new JPanel();
		MenuTab.addTab("Remove Menu Item", null, RemoveItem, null);
		RemoveItem.setLayout(null);
		
		List RemoveItemAllItemList = new List();
		RemoveItemAllItemList.setBounds(10, 10, 274, 432);
		RemoveItem.add(RemoveItemAllItemList);
		
		Button RemoveItemButton = new Button("Remove Item");
		RemoveItemButton.setBounds(538, 448, 195, 48);
		RemoveItem.add(RemoveItemButton);
		
		List RemoveItemRemoveList = new List();
		RemoveItemRemoveList.setBounds(459, 10, 274, 432);
		RemoveItem.add(RemoveItemRemoveList);
		
		Button AddToRemoveListButton = new Button("Add To List");
		AddToRemoveListButton.setBounds(290, 59, 163, 59);
		RemoveItem.add(AddToRemoveListButton);
		
		Button RemoveFromRemoveListButton = new Button("Remove From List");
		RemoveFromRemoveListButton.setBounds(290, 124, 163, 56);
		RemoveItem.add(RemoveFromRemoveListButton);
		
		JPanel InventoryTab = new JPanel();
		tabbedPane.addTab("Inventory", null, InventoryTab, null);
		InventoryTab.setLayout(null);
		
		List list_1 = new List();
		list_1.setBounds(10, 38, 176, 486);
		InventoryTab.add(list_1);
		
		Label label_5 = new Label("Dry Foods");
		label_5.setBounds(10, 10, 176, 22);
		InventoryTab.add(label_5);
		
		Label label_6 = new Label("Refrigerated Foods");
		label_6.setBounds(192, 10, 176, 22);
		InventoryTab.add(label_6);
		
		List list_4 = new List();
		list_4.setBounds(192, 38, 176, 486);
		InventoryTab.add(list_4);
		
		Label label_7 = new Label("Frozen Foods");
		label_7.setBounds(374, 10, 176, 22);
		InventoryTab.add(label_7);
		
		List list_5 = new List();
		list_5.setBounds(374, 38, 176, 486);
		InventoryTab.add(list_5);
		
		Label label_8 = new Label("Drinks");
		label_8.setBounds(556, 10, 176, 22);
		InventoryTab.add(label_8);
		
		List list_6 = new List();
		list_6.setBounds(556, 38, 176, 486);
		InventoryTab.add(list_6);
		
		JPanel EmployeeTab = new JPanel();
		tabbedPane.addTab("Employees", null, EmployeeTab, null);
		EmployeeTab.setLayout(null);
		
		Label label_9 = new Label("Employees:");
		label_9.setBounds(10, 10, 219, 22);
		EmployeeTab.add(label_9);
		
		List list_7 = new List();
		list_7.setBounds(10, 32, 219, 492);
		EmployeeTab.add(list_7);
		
		Checkbox checkbox = new Checkbox("Hourly");
		checkbox.setBounds(322, 243, 62, 22);
		EmployeeTab.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Salery");
		checkbox_1.setBounds(245, 243, 62, 22);
		EmployeeTab.add(checkbox_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(331, 215, 132, 22);
		EmployeeTab.add(textField_1);
		
		Label label_10 = new Label("Pay Rate");
		label_10.setBounds(235, 215, 90, 22);
		EmployeeTab.add(label_10);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(331, 159, 132, 22);
		EmployeeTab.add(textField_2);
		
		Label label_11 = new Label("Date Hired");
		label_11.setBounds(235, 159, 90, 22);
		EmployeeTab.add(label_11);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(456, 51, 190, 22);
		EmployeeTab.add(textField_3);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(235, 51, 174, 22);
		EmployeeTab.add(textField_4);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(331, 131, 132, 22);
		EmployeeTab.add(textField_5);
		
		TextField textField_6 = new TextField();
		textField_6.setBounds(469, 103, 255, 22);
		EmployeeTab.add(textField_6);
		
		TextField textField_7 = new TextField();
		textField_7.setBounds(469, 131, 255, 22);
		EmployeeTab.add(textField_7);
		
		TextField textField_8 = new TextField();
		textField_8.setBounds(469, 159, 255, 22);
		EmployeeTab.add(textField_8);
		
		Label label_12 = new Label("First Name");
		label_12.setBounds(235, 32, 117, 22);
		EmployeeTab.add(label_12);
		
		Label label_13 = new Label("Last Name");
		label_13.setBounds(456, 32, 117, 22);
		EmployeeTab.add(label_13);
		
		TextField textField_9 = new TextField();
		textField_9.setBounds(415, 51, 35, 22);
		EmployeeTab.add(textField_9);
		
		Label label_14 = new Label("MI");
		label_14.setBounds(415, 32, 35, 22);
		EmployeeTab.add(label_14);
		
		Label label_15 = new Label("Date of Birth");
		label_15.setBounds(235, 131, 90, 22);
		EmployeeTab.add(label_15);
		
		Label label_16 = new Label("Address");
		label_16.setBounds(469, 79, 117, 22);
		EmployeeTab.add(label_16);
		
		Button button_1 = new Button("Hire");
		button_1.setBounds(568, 462, 170, 62);
		EmployeeTab.add(button_1);
		
		Button button_2 = new Button("Fire");
		button_2.setBounds(392, 462, 170, 62);
		EmployeeTab.add(button_2);
		
		TextField textField_10 = new TextField();
		textField_10.setBounds(332, 271, 131, 22);
		EmployeeTab.add(textField_10);
		
		Label label_17 = new Label("EID");
		label_17.setBounds(235, 271, 90, 22);
		EmployeeTab.add(label_17);
		
		TextField textField_11 = new TextField();
		textField_11.setBounds(331, 187, 132, 22);
		EmployeeTab.add(textField_11);
		
		Label label_18 = new Label("Position");
		label_18.setBounds(235, 187, 90, 22);
		EmployeeTab.add(label_18);
		
		Button button_6 = new Button("Generate EID");
		button_6.setBounds(235, 299, 117, 22);
		EmployeeTab.add(button_6);
		
		Label label_19 = new Label("Phone Number");
		label_19.setBounds(235, 79, 90, 22);
		EmployeeTab.add(label_19);
		
		TextField textField_12 = new TextField();
		textField_12.setBounds(331, 79, 132, 22);
		EmployeeTab.add(textField_12);
		
		Label label_20 = new Label("Alternate Number");
		label_20.setBounds(235, 103, 90, 22);
		EmployeeTab.add(label_20);
		
		TextField textField_13 = new TextField();
		textField_13.setBounds(331, 103, 132, 22);
		EmployeeTab.add(textField_13);
	}
}
