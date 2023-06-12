SUMMARY = "Qt Wrapper around TpLogger client library"
DESCRIPTION = "Telepathy-logger-qt5 is a Qt Wrapper around the TpLogger client library. \
It is needed by KDE Telepathy in order to log the chat activity."
LICENSE = "LGPL-2.1-or-later"

PV = "17.09.0"

RPM_NAME = "libtelepathy-logger-qt5-17.09.0-1.16.aarch64.rpm"
RPM_HASH = "86feaf0e2b50282c1f0e04b0516dfdf56bfbe196d19be54788c5a3157dc5146c766b5a17e75e128814568989ca3a68e24eae9c6550c6108f93fd61b8eb17066d"

RPROVIDES:${PN} += "libtelepathy-logger-qt.so.5()(64bit) \
libtelepathy-logger-qt5 \
libtelepathy-logger-qt5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtelepathy-glib.so.0()(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.17)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.0)(64bit) \
libtelepathy-logger.so.3()(64bit) \
libtelepathy-qt5.so.0()(64bit)"

inherit rpm
