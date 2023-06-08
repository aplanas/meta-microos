SUMMARY = "Codemodel Annotation Compiler"
DESCRIPTION = "The annotation compiler ant task for the CodeModel java source code \
generation library."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-annotation-compiler-2.3.1-4.4.noarch.rpm"
RPM_HASH = "26d13dd1b049ce05219c512cba6a0ab4062b14916f849696756a0ea8d74ed4b772ea9f8e5ab1541a55c78aa4a14bffb3b696e1b7bc40558dd37aac73637a0e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel-annotation-compiler mvn(org.glassfish.jaxb:codemodel-annotation-compiler) mvn(org.glassfish.jaxb:codemodel-annotation-compiler:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.sun.istack:istack-commons-tools) mvn(org.glassfish.jaxb:codemodel)"

inherit rpm
