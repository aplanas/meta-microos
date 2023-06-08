SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Telepathy-Qt5-farstream is a high-level binding for Telepathy, similar to telepathy-glib but for Qt 5."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-farstream0-0.9.8-1.15.aarch64.rpm"
RPM_HASH = "4299d66c9cf7476cf26ad80f6fefcb4721efbd058ea09a4f7947eb3514bc4d4bd3048b8adb3ad638521169c3b22648bdd5adf41a36ae180d67372375ae7b8973"

RPROVIDES:${PN} += "libtelepathy-qt5-farstream.so.0()(64bit) libtelepathy-qt5-farstream0 libtelepathy-qt5-farstream0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-farstream.so.3()(64bit) libtelepathy-glib.so.0()(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) libtelepathy-qt5.so.0()(64bit)"

inherit rpm
