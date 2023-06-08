SUMMARY = "Component metadata from plexus-containers"
DESCRIPTION = "The Plexus project seeks to create end-to-end developer tools for \
writing applications. At the core is the container, which can be \
embedded or for a full scale application server. There are many \
reusable components for hibernate, form processing, jndi, i18n, \
velocity, etc. Plexus also includes an application server which \
is like a J2EE application server, without all the baggage."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-component-metadata-2.1.1-4.1.noarch.rpm"
RPM_HASH = "5212845884647a086f5bf5053e3ef73947154caca2891e31dfc0b0e15bccc00b0853d65990b12bfeb7f5257e8f75e04a03c5663d3f1a5c70f48db7223d2fa68e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-component-metadata) mvn(org.codehaus.plexus:plexus-component-metadata:pom:) plexus-component-metadata"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.thoughtworks.qdox:qdox) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-container-default) mvn(org.codehaus.plexus:plexus-utils) mvn(org.jdom:jdom2) mvn(org.ow2.asm:asm)"

inherit rpm
