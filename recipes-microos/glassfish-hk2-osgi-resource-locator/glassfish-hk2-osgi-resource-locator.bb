SUMMARY = "HK2 OSGi resource locator bundle"
DESCRIPTION = "Hundred Kilobytes Kernel - OSGi resource locator bundle. Used by \
various API providers that rely on META-INF/services mechanism to \
locate providers."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-osgi-resource-locator-2.5.0-2.3.noarch.rpm"
RPM_HASH = "3d1110942b006fa0c5f771bc940cc348b7d4c1425ca2dcd56244c8defa7f648a6fd67867e1d2cf0ecac14dad6bc179a7fad38265fe88afb215f608ac2ed084c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-osgi-resource-locator \
mvn(org.glassfish.hk2:osgi-resource-locator) \
mvn(org.glassfish.hk2:osgi-resource-locator:pom:) \
osgi(org.glassfish.hk2.osgi-resource-locator) \
osgi-resource-locator"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
