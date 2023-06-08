SUMMARY = "Qt5 Widgets Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 Widgets Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "libFcitx5Qt5WidgetsAddons2-5.0.16-1.7.aarch64.rpm"
RPM_HASH = "4015fc370d298ab0698ade467309bc34248742d145333ed082c95c637e2c86be30bce81fc589c6c2f2d975b489918f1a02561950b2ef194af9c56b44e8292c43"

RPROVIDES:${PN} += "libFcitx5Qt5WidgetsAddons.so.2()(64bit) libFcitx5Qt5WidgetsAddons2 libFcitx5Qt5WidgetsAddons2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Utils.so.2()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
