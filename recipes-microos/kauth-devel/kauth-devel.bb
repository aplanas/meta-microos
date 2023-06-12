SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kauth-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "4f46eb5a9459d3ee74c0406f4a90c5d1409eca3678539ece3e485769ec477a465e6ee4feb31971c2d7aff0df945dff82746cf93eb7a3b23122f0f6fa46f0118c"

RPROVIDES:${PN} += "cmake(KF5Auth) kauth-devel kauth-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) extra-cmake-modules libKF5Auth5"

inherit rpm
