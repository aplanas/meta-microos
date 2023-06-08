SUMMARY = "Config schema for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-schema-3.24.37+70-1.1.noarch.rpm"
RPM_HASH = "2958b3550a1fc20ea960418e81cfdd4a25d30a73b8ee1ccfa9e69548e93a146f6c8acf24d31ad6b10854f4ef04b154cb067c572ec1dcdfa25657d674f24ce7e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-schema"
RDEPENDS:${PN} += ""

inherit rpm
