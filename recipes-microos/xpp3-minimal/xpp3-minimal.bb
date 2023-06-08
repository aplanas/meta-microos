SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-minimal-1.1.4c-6.6.noarch.rpm"
RPM_HASH = "305974cbd8ee6b633fc53df5cb8861a087b686e2d4f229ddfa862fc3ab33455bbafce8865da726dbf776b035833ea2ed91bb010f5657a5dcc856509060da16e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(xpp3:xpp3_min) mvn(xpp3:xpp3_min:pom:) xpp3-minimal"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
