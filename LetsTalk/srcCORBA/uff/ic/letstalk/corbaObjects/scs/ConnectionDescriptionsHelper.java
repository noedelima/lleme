package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/ConnectionDescriptionsHelper.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min27s BRST
 */

abstract public class ConnectionDescriptionsHelper {
	private static String _id = "IDL:corbaObjects/scs/ConnectionDescriptions:1.0";

	public static void insert(org.omg.CORBA.Any a,
			uff.ic.letstalk.corbaObjects.scs.ConnectionDescription[] that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static uff.ic.letstalk.corbaObjects.scs.ConnectionDescription[] extract(
			org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = uff.ic.letstalk.corbaObjects.scs.ConnectionDescriptionHelper.type();
			__typeCode = org.omg.CORBA.ORB.init().create_sequence_tc(0,
					__typeCode);
			__typeCode = org.omg.CORBA.ORB.init().create_alias_tc(uff.ic.letstalk.corbaObjects.scs.ConnectionDescriptionsHelper.id(),
					"ConnectionDescriptions", __typeCode);
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static uff.ic.letstalk.corbaObjects.scs.ConnectionDescription[] read(
			org.omg.CORBA.portable.InputStream istream) {
		uff.ic.letstalk.corbaObjects.scs.ConnectionDescription value[] = null;
		int _len0 = istream.read_long();
		value = new uff.ic.letstalk.corbaObjects.scs.ConnectionDescription[_len0];
		for (int _o1 = 0; _o1 < value.length; ++_o1)
			value[_o1] = uff.ic.letstalk.corbaObjects.scs.ConnectionDescriptionHelper
					.read(istream);
		return value;
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			uff.ic.letstalk.corbaObjects.scs.ConnectionDescription[] value) {
		ostream.write_long(value.length);
		for (int _i0 = 0; _i0 < value.length; ++_i0)
			uff.ic.letstalk.corbaObjects.scs.ConnectionDescriptionHelper.write(ostream,
					value[_i0]);
	}

}
