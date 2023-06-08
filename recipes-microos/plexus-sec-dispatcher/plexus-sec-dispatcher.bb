SUMMARY = "Plexus Security Dispatcher Component"
DESCRIPTION = "Plexus Security Dispatcher Component"
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-sec-dispatcher-2.0-3.4.noarch.rpm"
RPM_HASH = "db58151a4914167bc15a6f37750c177215c30558dbcf1a5104bb1bb1bf97718551c494cd532e63be05b41b73c440e2e7a9a1c6c65f51f4ad8559d8b82df8188c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-sec-dispatcher) mvn(org.codehaus.plexus:plexus-sec-dispatcher:pom:) mvn(org.sonatype.plexus:plexus-sec-dispatcher) mvn(org.sonatype.plexus:plexus-sec-dispatcher:pom:) plexus-sec-dispatcher"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.inject:javax.inject) mvn(org.codehaus.plexus:plexus-cipher) mvn(org.codehaus.plexus:plexus-utils) mvn(org.sonatype.plexus:plexus-cipher)"

inherit rpm
