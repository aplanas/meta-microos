SUMMARY = "Source generator library for Java"
DESCRIPTION = "This project is a fork of Sun's (now Oracle's) com.sun.codemodel project. We \
decided to fork the project because by all evidence, the upstream project is \
dead and not actively accepting outside contribution. All JBoss projects are \
urged to use this project instead for source code generation."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "jdeparser-2.0.3-1.18.noarch.rpm"
RPM_HASH = "27538e8ad87bb427a41bdc28759846bb549a86b9834f5c1db53a1a4409a04617b7d3b9d76573770eb36e5d02a5f1303d7529de40a458aafcdb9fa798f619127c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdeparser mvn(org.jboss.jdeparser:jdeparser) mvn(org.jboss.jdeparser:jdeparser:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
