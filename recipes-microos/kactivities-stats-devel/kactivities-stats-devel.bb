SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kactivities-stats-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "b8cae443702b2c3194ff7655b9200522f59ebc73be47c94deb66cb79d1443e3d930e65a4a2a624ad3baa2cf912139255b361d68ed9fb816e033c6f548a2de305"

RPROVIDES:${PN} += "cmake(KF5ActivitiesStats) \
kactivities-stats-devel \
kactivities-stats-devel(aarch-64) \
pkgconfig(libKActivitiesStats)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt5Core) \
extra-cmake-modules \
libKF5ActivitiesStats1 \
pkgconfig(Qt5Core)"

inherit rpm
