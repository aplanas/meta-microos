SUMMARY = "Plexus I18N Component"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "1.0~beta10"

RPM_NAME = "plexus-i18n-1.0~beta10-3.6.noarch.rpm"
RPM_HASH = "1e6956cf114bd0958c133f0db619296c8191a9cbff95a59a38ae5ad4be92f3e71b09d4c8c32f969ab0c28fe47762063e867bff02762e724c4a58fc2472c37976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-i18n) \
mvn(org.codehaus.plexus:plexus-i18n:pom:) \
plexus-i18n"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
