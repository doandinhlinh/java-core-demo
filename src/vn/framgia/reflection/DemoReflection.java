package vn.framgia.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Logger;

import vn.framgia.demo.Student;

public class DemoReflection {
	public static Logger logger = Logger.getLogger("vn.framgia.reflection");

	public static void main(String[] args) {		
		DemoReflection demoReflection = new DemoReflection();
		demoReflection.getClassInfo("vn.framgia.reflection.DemoReflection");
	}

	public void getClassInfo(String className) {
		try {
			Class<?> aClass = Class.forName(className);
			getClassInfo(aClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			logger.info("Class not found!");
			e.printStackTrace();
		}
	}

	public void getClassInfo(Class aClass) {
		System.out.println("Name: " + aClass.getName());
		System.out.println("Simple Name: " + aClass.getSimpleName());

		getModifiersInfo(aClass);
		getSuperClassInfo(aClass);
		getInterfacesInfo(aClass);
		getConstructorsInfo(aClass);
		getMethodsInfo(aClass);
		getFieldsInfo(aClass);
	}

	public void getModifiersInfo(Class aClass) {

		int modifiers = aClass.getModifiers();
		boolean isPublic = Modifier.isPublic(modifiers);
		boolean isInterface = Modifier.isInterface(modifiers);
		boolean isAbstract = Modifier.isAbstract(modifiers);
		boolean isFinal = Modifier.isFinal(modifiers);

		System.out.println("Is Public? " + isPublic);
		System.out.println("Is Final? " + isFinal);
		System.out.println("Is Interface? " + isInterface);
		System.out.println("Is Abstract? " + isAbstract);

	}

	public void getSuperClassInfo(Class aClass) {
		Class<?> aSuperClass = aClass.getSuperclass();
		System.out.println("Class Name of Super class = " + aSuperClass.getName());
		System.out.println("Simple Class Name of Super class = " + aSuperClass.getSimpleName());
	}

	public void getInterfacesInfo(Class aClass) {
		System.out.println("\nInterface:");
		Class<?>[] itfClasses = aClass.getInterfaces();
		for (Class<?> itfClass : itfClasses) {
			System.out.println("+ " + itfClass.getSimpleName());
		}
	}

	public void getConstructorsInfo(Class aClass) {
		System.out.println("\nConstructor:");
		Constructor<?>[] constructors = aClass.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("+ " + constructor.getName() + " has " + constructor.getParameterCount() + " param");
		}
	}

	public void getMethodsInfo(Class aClass) {
		System.out.println("\nDeclared Methods:");
		Method[] methods = aClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("+ " + method.getName());
		}
	}
	
	public void getFieldsInfo(Class aClass) {
		System.out.println("\nField:");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println("+ " + field.getName());
        }
	}

}
