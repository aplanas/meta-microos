SUMMARY = "Qt 6 Designer library"
DESCRIPTION = "This package contains the Qt 6 Designer Library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "libQt6Designer6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "db2e7ee26884e8239c808b73ecbb0afcfef48b57ab9c1f4443a5f2dacf51b61b4f1967f67d0833b21409ae6644c018d240ee66ffdb7b4f8c7edf8ab80236a656"

RPROVIDES:${PN} += "libQt6Designer.so.6()(64bit) libQt6Designer.so.6(Qt_6)(64bit) libQt6Designer.so.6(Qt_6.0)(64bit) libQt6Designer.so.6(Qt_6.1)(64bit) libQt6Designer.so.6(Qt_6.2)(64bit) libQt6Designer.so.6(Qt_6.3)(64bit) libQt6Designer.so.6(Qt_6.4)(64bit) libQt6Designer.so.6(Qt_6.5)(64bit) libQt6Designer.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Designer6 libQt6Designer6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGLWidgets.so.6()(64bit) libQt6OpenGLWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
