package pl.polew.mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.polew.mp3player.mp3.Mp3Song;
 
public class ContentPaneController implements Initializable{
 
	public static final String TITLE_COLUMN = "Tytu�";
	public static final String AUTHOR_COLUMN = "Autor";
	public static final String ALBUM_COLUMN = "Album";
	
    @FXML
    private TableView<Mp3Song> contentTable;
    
    public TableView<Mp3Song> getContentTable() {
		return contentTable;
	}
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureTable();
    }
    
    private void configureTable() {
    	TableColumn<Mp3Song, String> titleColumn = new TableColumn<Mp3Song, String>(TITLE_COLUMN);
    	titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
    	
    	TableColumn<Mp3Song, String> authorColumn = new TableColumn<Mp3Song, String>(AUTHOR_COLUMN);
    	titleColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
    	
    	TableColumn<Mp3Song, String> albumColumn = new TableColumn<Mp3Song, String>(ALBUM_COLUMN);
        albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));
        
        contentTable.getColumns().add(titleColumn);
        contentTable.getColumns().add(authorColumn);
        contentTable.getColumns().add(albumColumn);
    }
}