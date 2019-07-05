package ui;

import java.awt.Color;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;

import domain.Bag;
import domain.Texto;

public class MainView extends MainWindow<Bag> {
	private static final long serialVersionUID = 1L;
	
	public MainView(Bag model) {
		super(model);
	}

	@Override
	public void createContents(Panel mainPanel) {
		new Label(mainPanel).setBackground(Color.ORANGE).bindValueToProperty("titulo");
		Table<Texto> t = new Table<Texto>(mainPanel, Texto.class);
		t.setNumberVisibleRows(10);
		t.setWidth(450);
		t.bindValueToProperty("lista");
		new Column<Texto>(t)
			.setTitle("Title")
			.alignLeft()
			.bindContentsToProperty("texto");
	}
}
