SUMMARY = "Monodoc documentation for gtk-sharp2"
DESCRIPTION = "This package contains the gtk-sharp2 documentation for monodoc."
LICENSE = "LGPL-2.1-only"

PV = "2.99.4"

RPM_NAME = "gtk-sharp3-doc-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "7b12734a8a8d9ec48741b82a5d3616138aa60823ae4010ed045670f32a98ddd0d16b22b5f8032a528326a491ba4cba5c4fbd504c8ad7d88fbabef00655841f9d"

RPROVIDES:${PN} += "gtk-sharp3-doc \
gtk-sharp3-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
