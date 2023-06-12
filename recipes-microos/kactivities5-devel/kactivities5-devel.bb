SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kactivities5-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "445297cc4ad0b065ea46b30361299ea150247b5a7f76c6e1016a647231ac4cd759a9604142dbe1ff5f1e4a32335b123e9b038adb606c878c4ae37b57a56943cc"

RPROVIDES:${PN} += "cmake(KF5Activities) kactivities5-devel kactivities5-devel(aarch-64) pkgconfig(libKActivities)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt5Core) extra-cmake-modules libKF5Activities5 pkgconfig(Qt5Core)"

inherit rpm
