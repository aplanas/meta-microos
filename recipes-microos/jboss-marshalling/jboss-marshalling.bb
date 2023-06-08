SUMMARY = "JBoss Marshalling"
DESCRIPTION = "JBoss Marshalling is an alternative serialization API that fixes many \
of the problems found in the JDK serialization API while remaining \
fully compatible with java.io.Serializable and its relatives, and adds \
several new tunable parameters and additional features, all of which \
are pluggable via factory configuration (externalizers, class/instance \
lookup tables, class resolution, and object replacement, to name a \
few)."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-1.4.11-1.20.noarch.rpm"
RPM_HASH = "7e2e364dcd9b8b58a579bfba06f9dd87aa0335656b0465f0903ae20abd46ae8ba50cabc76df1229195abf763c79b1060b7e4acdd2e390cca66c3062b28979fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling mvn(org.jboss.marshalling:jboss-marshalling) mvn(org.jboss.marshalling:jboss-marshalling-parent:pom:) mvn(org.jboss.marshalling:jboss-marshalling-river) mvn(org.jboss.marshalling:jboss-marshalling-river:pom:) mvn(org.jboss.marshalling:jboss-marshalling-serial) mvn(org.jboss.marshalling:jboss-marshalling-serial:pom:) mvn(org.jboss.marshalling:jboss-marshalling:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
