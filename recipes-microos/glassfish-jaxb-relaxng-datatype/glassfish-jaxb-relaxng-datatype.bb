SUMMARY = "RelaxNG Datatype"
DESCRIPTION = "This package contains RelaxNG Datatype."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-relaxng-datatype-2.3.1-4.4.noarch.rpm"
RPM_HASH = "f89c58ff1ca854a9acc4583f15b4575974a885150aafce788227d31a32e0c504a3e3a9879149fa46224d20e0f797b0eccddbd63fa9d2a90226b0659b47ebb197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-relaxng-datatype mvn(com.sun.xml.bind.external:relaxng-datatype) mvn(com.sun.xml.bind.external:relaxng-datatype:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
