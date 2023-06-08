SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kactivities5-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "47635e379e7de3c4a214382a24dc0ad5df50f354dec319d5878d3b3dced736699eda5a087f285868ab36665ebd8f9b060776243ca89c98712a7acf4912f81346"

RPROVIDES:${PN} += "cmake(KF5Activities) kactivities5-devel kactivities5-devel(aarch-64) pkgconfig(libKActivities)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt5Core) extra-cmake-modules libKF5Activities5 pkgconfig(Qt5Core)"

inherit rpm
