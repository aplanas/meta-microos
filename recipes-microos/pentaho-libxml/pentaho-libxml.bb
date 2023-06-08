SUMMARY = "Namespace aware SAX parser utility library"
DESCRIPTION = "Pentaho LibXML is a namespace aware SAX parser utility library. It \
facilitates implementing non-trivial SAX input handlers."
LICENSE = "LGPL-2.0-only"

PV = "1.1.3"

RPM_NAME = "pentaho-libxml-1.1.3-6.6.noarch.rpm"
RPM_HASH = "0369d1e655cef5683af0d2d55a06b0b23bc9e325b7122661c3ca11c5e70eae358a0a6cd154f976bec9aa6f193f9a8e6d81f6fef09f16c49fc7b4d43b1692915c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml"
RDEPENDS:${PN} += "java jpackage-utils libbase libloader"

inherit rpm
