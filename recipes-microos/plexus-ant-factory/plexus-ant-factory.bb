SUMMARY = "Plexus Ant component factory"
DESCRIPTION = "Ant component class creator for Plexus."
LICENSE = "Apache-2.0"

PV = "1.0~a2.1"

RPM_NAME = "plexus-ant-factory-1.0~a2.1-2.6.noarch.rpm"
RPM_HASH = "f28495a045e6f450873b460c0d0bfe1f1654463fed65477446cb12afe5d336226084181a941b4f0988e096a093bb96f7eb1e2904e1048370e4f330e24e011936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-ant-factory) mvn(org.codehaus.plexus:plexus-ant-factory:pom:) plexus-ant-factory"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.ant:ant) mvn(org.apache.ant:ant-launcher) mvn(org.codehaus.plexus:plexus-container-default) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
