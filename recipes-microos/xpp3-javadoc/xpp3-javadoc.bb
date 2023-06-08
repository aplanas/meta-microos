SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-javadoc-1.1.4c-6.6.noarch.rpm"
RPM_HASH = "2dda5577288fd6048e6f1b8a3627069c6e875203d859bc9fe02f45d60f8b33924b32190eda1c8851211cf355cc50a49d2ac26d3253a0fefeff1cfa7290336ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp3-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
