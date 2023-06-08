SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kactivities-stats-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "e675d72c32b506a479a2c1956781da72a09c05cbbd436241564e3c2d434657376e8c5455cfa9ff5ad7e4d1421e2baffc55000b1dc862c94f0da711512155fc89"

RPROVIDES:${PN} += "cmake(KF5ActivitiesStats) kactivities-stats-devel kactivities-stats-devel(aarch-64) pkgconfig(libKActivitiesStats)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt5Core) extra-cmake-modules libKF5ActivitiesStats1 pkgconfig(Qt5Core)"

inherit rpm
