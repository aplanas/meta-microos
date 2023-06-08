SUMMARY = "Codemodel Core"
DESCRIPTION = "The core functionality of the CodeModel java source code generation \
library."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-2.3.1-4.4.noarch.rpm"
RPM_HASH = "a6402de1081b23231ae0c0c2306d42c25c7cdeeffd49803786d9b01106621169162bc8d70b8fb6b3aa9ae0b2f9196d4248ec86715704b6c7c8af8ad2ac88cb5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel mvn(org.glassfish.jaxb:codemodel) mvn(org.glassfish.jaxb:codemodel:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
