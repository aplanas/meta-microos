SUMMARY = "Development files for the KDE scanning library"
DESCRIPTION = "This package contains a library to add scan support to KDE \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libksane-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "21350bc8a7f40106a80c406cefd678df2d48b68ab604da26a59f33fe93a0c8fcb4d2c4e6b37ea6290d3fa668e1dc5d57dfd33ef87a5d3c3ee3d99ed47ef348c6"

RPROVIDES:${PN} += "cmake(KF5Sane) libksane-devel libksane-devel(aarch-64) libksane-kf5-devel"
RDEPENDS:${PN} += "cmake(KF5Wallet) cmake(KF5WidgetsAddons) cmake(Qt5Widgets) libKF5Sane5 pkgconfig sane-backends-devel"

inherit rpm
