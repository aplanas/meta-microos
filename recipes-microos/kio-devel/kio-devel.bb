SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kio-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "9dcdacff1a4b3a1099a7b2fb0aa1411ea738cd036f6f5661a4dcd976ba07df9d105b85a0dc59e080dc7c13839e398aca83582538fce6281fc986b1090c22d62c"

RPROVIDES:${PN} += "cmake(KF5KIO) kio-devel kio-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Bookmarks) cmake(KF5Completion) cmake(KF5Config) cmake(KF5CoreAddons) cmake(KF5ItemViews) cmake(KF5JobWidgets) cmake(KF5Service) cmake(KF5Solid) cmake(KF5WindowSystem) cmake(KF5XmlGui) cmake(Qt5Concurrent) cmake(Qt5DBus) cmake(Qt5Network) extra-cmake-modules kio kio-core ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
