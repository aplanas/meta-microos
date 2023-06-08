SUMMARY = "Plexus Archiver Component"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "4.2.1"

RPM_NAME = "plexus-archiver-4.2.1-2.8.noarch.rpm"
RPM_HASH = "8919380d234b6ff44dc1483cb3b1afecd934473b5660779aca47ce78b07a24e2f7aaf146108b07abe47f73452a2294ac9c3ae21bd60f13a3731c195f1e512146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-archiver) mvn(org.codehaus.plexus:plexus-archiver:pom:) plexus-archiver"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.commons:commons-compress) mvn(org.codehaus.plexus:plexus-io) mvn(org.codehaus.plexus:plexus-utils) mvn(org.tukaani:xz)"

inherit rpm
