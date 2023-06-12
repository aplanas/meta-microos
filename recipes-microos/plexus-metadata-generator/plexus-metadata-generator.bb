SUMMARY = "Component metadata from plexus-containers"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-metadata-generator-2.1.1-4.1.noarch.rpm"
RPM_HASH = "f83394214eb96738be5d4766444a08609ae35944efbb28c1effa176f11f2d37bb202e08f83679dc345bb5b7d2e227296961058ec7db596d7910881bac6a242a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-metadata-generator) \
mvn(org.codehaus.plexus:plexus-metadata-generator:pom:) \
plexus-metadata-generator"
RDEPENDS:${PN} += "/bin/bash \
apache-commons-cli \
guava \
java-headless \
javapackages-filesystem \
jdom2 \
mvn(com.thoughtworks.qdox:qdox) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.jdom:jdom2) \
mvn(org.ow2.asm:asm) \
objectweb-asm \
plexus-cli \
plexus-containers-component-annotations \
plexus-containers-container-default \
plexus-utils \
qdox \
xbean"

inherit rpm
