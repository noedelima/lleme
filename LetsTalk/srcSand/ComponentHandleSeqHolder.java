/**
 * ComponentHandleSeqHolder.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from deployment.idl Saturday, December 10, 2005
 * 1:24:06 AM GMT
 */

public final class ComponentHandleSeqHolder implements
		org.omg.CORBA.portable.Streamable {
	public ComponentHandle value[] = null;

	public ComponentHandleSeqHolder() {
	}

	public ComponentHandleSeqHolder(ComponentHandle[] initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = ComponentHandleSeqHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		ComponentHandleSeqHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return ComponentHandleSeqHelper.type();
	}

}
