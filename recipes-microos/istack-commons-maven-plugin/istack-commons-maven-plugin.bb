SUMMARY = "Istack-commons Maven Mojo"
DESCRIPTION = "This package contains the istack-commons Maven Mojo."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-maven-plugin-3.0.7-4.4.noarch.rpm"
RPM_HASH = "fb7d538410e8de65c7ca9caa0b6d77258a9f0c7cab6f7a85c45008a0abc4ef0a547fa20789a54c64647513c294aaaeabf875c1aada82fb668a57f2886ce8618e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-maven-plugin mvn(com.sun.istack:istack-commons-maven-plugin) mvn(com.sun.istack:istack-commons-maven-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.sun.codemodel:codemodel) mvn(org.apache.maven.resolver:maven-resolver-impl) mvn(org.apache.maven.shared:file-management) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-archiver) mvn(org.codehaus.plexus:plexus-io) mvn(org.tukaani:xz)"

inherit rpm
