SUMMARY = "Text translation library"
DESCRIPTION = "This package provides a library for automated text translation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libKF5TextTranslator1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "5ad0c91e2ce2a2dc79478bd55c8a6e10bb58c83f8c4ae4c8982100a0c57c870547070436bb85c4b3d1fc7627907e5866833a73a6c2564088a4e3f3b60a95e20f"

RPROVIDES:${PN} += "libKF5TextTranslator.so.1()(64bit) libKF5TextTranslator1 libKF5TextTranslator1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ktextaddons ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
