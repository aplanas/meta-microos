SUMMARY = "JBoss Marshalling OSGi Bundle"
DESCRIPTION = "JBoss Marshalling OSGi Bundle."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-osgi-1.4.11-1.20.noarch.rpm"
RPM_HASH = "893d3f4af08f7eb1c30f5ae54011cbcae2fc87872b4a859a89289c397f061bc2e66d05059cd1e045ff1d85cb68227101eaf87da677d6405a22e58c38ff6deb49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-osgi mvn(org.jboss.marshalling:jboss-marshalling-osgi) mvn(org.jboss.marshalling:jboss-marshalling-osgi:pom:) osgi(org.jboss.marshalling.jboss-marshalling-osgi)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.jboss.marshalling:jboss-marshalling) mvn(org.jboss.marshalling:jboss-marshalling-river) mvn(org.jboss.marshalling:jboss-marshalling-serial)"

inherit rpm
