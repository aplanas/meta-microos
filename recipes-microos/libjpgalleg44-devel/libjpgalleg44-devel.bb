SUMMARY = "Development files for JPGAlleg"
DESCRIPTION = "This package is needed to build programs that use JPGAlleg."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libjpgalleg44-devel-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "7d41fc32c6f78ad79f3ba7ad56a70fe472991f5d4ad3c40dcc1bd3d157506762760783554c06cc2821c80e8ee37bee1f1829d710c7315c6ab856c371466bfe47"

RPROVIDES:${PN} += "libjpgalleg-devel \
libjpgalleg44-devel \
libjpgalleg44-devel(aarch-64) \
pkgconfig(jpgalleg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpgalleg4_4 \
pkgconfig(allegro)"

inherit rpm
