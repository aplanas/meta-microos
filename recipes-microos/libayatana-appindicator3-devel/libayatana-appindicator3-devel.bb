SUMMARY = "Development files for libayatana-appindicator3"
DESCRIPTION = "This package contains the development files for the ayatana \
appindicator3 library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator3-devel-0.5.91-1.4.aarch64.rpm"
RPM_HASH = "5662afadc63c026bd64ee0da45c2594f49ceed6395ce2d5bcb0a46170e9084ca1cca729c21b7fd5815dad844de20c2064fd6422ae8ca40ce993588dedabf6647"

RPROVIDES:${PN} += "libayatana-appindicator3-devel \
libayatana-appindicator3-devel(aarch-64) \
pkgconfig(ayatana-appindicator3-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-appindicator3-1 \
pkgconfig(ayatana-indicator3-0.4) \
pkgconfig(dbusmenu-glib-0.4) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
