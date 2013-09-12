package by.bsu.goncharov.service;

import by.bsu.goncharov.exceptions.LogicalException;

public interface TreeService {

	int grow() throws LogicalException;
	int shake();
	int flower();
}
