package capstone.scorebook.data.datatype;

import capstone.scorebook.data.StorableStruct;

import java.sql.ResultSet;

public abstract class Location extends IDStorable { // something that has an address

	private static final String COLUMN_ADDRESS_ID = "aid"; // column names

	public Location(StorableStruct struct, ResultSet rs) { super(struct, rs); }

	public Location(StorableStruct struct, String addressID, Object... values) {

		super(struct, values, COLUMN_ADDRESS_ID, addressID); // must pass directly into constructor because IDStorable might need this info for generating an ID

	}

	public String getAddressID() { return getValue(COLUMN_ADDRESS_ID); }

}
