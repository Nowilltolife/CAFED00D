package me.coley.cafedude.transform;

import me.coley.cafedude.classfile.ClassFile;
import me.coley.cafedude.classfile.ConstPool;

/**
 * Base transformer outline.
 *
 * @author Matt Coley
 */
public abstract class Transformer {
	protected final ClassFile clazz;
	protected final ConstPool pool;

	/**
	 * @param clazz
	 * 		Class file to modify.
	 */
	public Transformer(ClassFile clazz) {
		this.clazz = clazz;
		pool = clazz.getPool();
	}

	/**
	 * Apply the transformation.
	 */
	public abstract void transform();
}
