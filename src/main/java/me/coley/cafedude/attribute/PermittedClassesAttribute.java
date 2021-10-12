package me.coley.cafedude.attribute;

import java.util.List;

/**
 * Permitted classes attribute.
 *
 * @author Matt Coley
 */
public class PermittedClassesAttribute extends Attribute {
	private List<Integer> classes;

	/**
	 * @param nameIndex
	 * 		Name index in constant pool.
	 * @param classes
	 * 		Indices of allowed {@code CP_CLASS} values.
	 */
	public PermittedClassesAttribute(int nameIndex, List<Integer> classes) {
		super(nameIndex);
		this.classes = classes;
	}

	/**
	 * @return Indices of allowed {@code CP_CLASS} values.
	 */
	public List<Integer> getClasses() {
		return classes;
	}

	/**
	 * @param classes
	 * 		New indices of allowed {@code CP_CLASS} values.
	 */
	public void setClasses(List<Integer> classes) {
		this.classes = classes;
	}

	@Override
	public int computeInternalLength() {
		// u2: count
		// u2: class_index * count
		return 2 + (2 * classes.size());
	}
}
