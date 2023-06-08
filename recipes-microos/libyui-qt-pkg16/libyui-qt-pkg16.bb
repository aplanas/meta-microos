SUMMARY = "Libyui - Qt package selector"
DESCRIPTION = "This package contains the Qt package selector component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-qt-pkg16-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "3c6f5f545f267c96b00b39b724f4ba3eb71587bf8b76a81ef8d82bedc0cb7b6b33c0576ad16d9dfe73081aec6de4039c5f7b4c4a7b4221884942bcaa98465f96"

RPROVIDES:${PN} += "libyui-qt-pkg libyui-qt-pkg.so.16()(64bit) libyui-qt-pkg16 libyui-qt-pkg16(aarch-64) libyui_pkg yast2-qt-pkg"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg5 libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libyui-qt16 libyui.so.16()(64bit) libyui16 libzypp libzypp.so.1722()(64bit) libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm
