SUMMARY = "Header files for the Tomoe handwriting recognition engine"
DESCRIPTION = "Header files for the Tomoe handwriting recognition engine."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-devel-0.6.0-51.4.aarch64.rpm"
RPM_HASH = "bb853ae11a6e8a7fe6569d41759e32e61b4e240b71e0eaf4d37a0dd6d89cfdf487b71e3e655bb2ad26369fc40647cf84b005662bb47ea32a485d603f2d4c21b3"

RPROVIDES:${PN} += "pkgconfig(tomoe) \
tomoe-devel \
tomoe-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
pkgconfig(glib-2.0) \
tomoe"

inherit rpm
