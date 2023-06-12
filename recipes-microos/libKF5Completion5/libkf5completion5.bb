SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Completion5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c359c01f44c7360c3ebba2518f55d57d3437074d9fac304b87039d11fabcbcf7ddffd2b79c7f89a3df3dbc710f56ea45a458bbbfff74c2672cdf468a76085335"

RPROVIDES:${PN} += "libKF5Completion.so.5()(64bit) libKF5Completion5 libKF5Completion5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
