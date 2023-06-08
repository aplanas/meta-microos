SUMMARY = "Qt 5 Help Library"
DESCRIPTION = "The Qt 5 Help library."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libQt5Help5-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "50370de009c37159845f8b410ed3d089b7a65909b3fd71aa00c2c51d3de3cf9401927c6a02bfe734e127ac786cf5602f75706911f48ecbc5cc9db94aa8044049"

RPROVIDES:${PN} += "libQt5Help.so.5()(64bit) libQt5Help.so.5(Qt_5)(64bit) libQt5Help.so.5(Qt_5.0)(64bit) libQt5Help.so.5(Qt_5.1)(64bit) libQt5Help.so.5(Qt_5.10)(64bit) libQt5Help.so.5(Qt_5.11)(64bit) libQt5Help.so.5(Qt_5.12)(64bit) libQt5Help.so.5(Qt_5.13)(64bit) libQt5Help.so.5(Qt_5.14)(64bit) libQt5Help.so.5(Qt_5.15)(64bit) libQt5Help.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Help.so.5(Qt_5.2)(64bit) libQt5Help.so.5(Qt_5.3)(64bit) libQt5Help.so.5(Qt_5.4)(64bit) libQt5Help.so.5(Qt_5.5)(64bit) libQt5Help.so.5(Qt_5.6)(64bit) libQt5Help.so.5(Qt_5.7)(64bit) libQt5Help.so.5(Qt_5.8)(64bit) libQt5Help.so.5(Qt_5.9)(64bit) libQt5Help5 libQt5Help5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network5 libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql5 libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
