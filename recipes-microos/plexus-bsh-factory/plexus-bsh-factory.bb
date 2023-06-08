SUMMARY = "Plexus Bsh component factory"
DESCRIPTION = "Bsh component class creator for Plexus."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-bsh-factory-1.0~a7-2.6.noarch.rpm"
RPM_HASH = "3e0223d89efadcc9ab737c519b713b7c3ec51901cb27f8ca7b3be6956be22b4cdc697becfdcbfa6a17074fb8fad30852aeb03d8e76c1907638e4b3584e8f00de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-bsh-factory) mvn(org.codehaus.plexus:plexus-bsh-factory:pom:) plexus-bsh-factory"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(bsh:bsh) mvn(classworlds:classworlds) mvn(org.codehaus.plexus:plexus-container-default) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
