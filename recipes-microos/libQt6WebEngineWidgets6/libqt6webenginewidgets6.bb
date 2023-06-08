SUMMARY = "Qt6 WebEngineWidgets library"
DESCRIPTION = "The Qt6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6WebEngineWidgets6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "cdb16f6fa2c8e2c29ac11274464c7dccd0e04018e1f78c15f521019fe591da0e0070b1d069ddcaae2d2bf4d069b45b495df11c11348f7b6b13aba76a905d2d91"

RPROVIDES:${PN} += "libQt6WebEngineWidgets.so.6()(64bit) libQt6WebEngineWidgets.so.6(Qt_6)(64bit) libQt6WebEngineWidgets.so.6(Qt_6.0)(64bit) libQt6WebEngineWidgets.so.6(Qt_6.1)(64bit) libQt6WebEngineWidgets.so.6(Qt_6.2)(64bit) libQt6WebEngineWidgets.so.6(Qt_6.3)(64bit) libQt6WebEngineWidgets.so.6(Qt_6.4)(64bit) libQt6WebEngineWidgets.so.6(Qt_6.5)(64bit) libQt6WebEngineWidgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebEngineWidgets6 libQt6WebEngineWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6PrintSupport.so.6()(64bit) libQt6PrintSupport.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6QuickWidgets.so.6()(64bit) libQt6QuickWidgets.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6()(64bit) libQt6WebEngineCore.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
