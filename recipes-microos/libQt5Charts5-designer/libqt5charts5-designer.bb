SUMMARY = "Designer plugin for the Qt 5 Charts library"
DESCRIPTION = "This package provides Qt Designer plugin for development with Qt Charts."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Charts5-designer-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "f5a94e005092be0681baa6787ba198b9cc8f346b9e591578766d1a6657ae1fe8f3eada39ddfc3762893cebc8e86a8da8c3b08bfce9b724c8ed3d216432e8508f"

RPROVIDES:${PN} += "libQt5Charts5-designer libQt5Charts5-designer(aarch-64) libqtchartsdesigner.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Charts.so.5()(64bit) libQt5Charts.so.5(Qt_5)(64bit) libQt5Charts5-devel libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libqt5-qttools libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
