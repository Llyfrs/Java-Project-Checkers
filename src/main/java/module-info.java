module java1_2022_dre0060 {
	  requires transitive javafx.controls;
	  requires javafx.fxml;
		opens checkers to javafx.fxml;
		exports checkers;
		
}
