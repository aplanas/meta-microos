SUMMARY = "Configuration library for JVM languages"
DESCRIPTION = "Configuration library for JVM languages."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "typesafe-config-1.4.1-4.5.noarch.rpm"
RPM_HASH = "7b9a6ad3a2ee19e3b5c71bf63384b90ea256ef8a15ef6388927c1f4ae28d4a0687495f2f094ce02fa1cafdea7b68db5bd384707c3c461f2ab26dec82c32a8753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.typesafe:config) mvn(com.typesafe:config:pom:) typesafe-config"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
