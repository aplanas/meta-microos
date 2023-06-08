SUMMARY = "Telepathy common module"
DESCRIPTION = "ktp-common-internals is the base library for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-common-internals-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bb963e24d8f77524ba1a11b61064b2b9d39840f28801701b6f5d8fe8c182dca88ac1ce163b5b2d88db700d17cd189ab3d0ffdf3271d78a073343a703707c80fa"

RPROVIDES:${PN} += "cmake(KTp) ktp-common-internals-devel ktp-common-internals-devel(aarch-64) ktp-common-internals5-devel"
RDEPENDS:${PN} += "cmake(KF5KCMUtils) cmake(KF5Wallet) cmake(Qt5Widgets) extra-cmake-modules ktp-common-internals pkgconfig telepathy-logger-qt5-devel telepathy-qt5-devel"

inherit rpm
