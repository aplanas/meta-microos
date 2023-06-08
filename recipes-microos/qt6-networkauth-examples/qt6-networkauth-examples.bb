SUMMARY = "Examples for the qt6-networkauth modules"
DESCRIPTION = "Examples for the qt6-networkauth modules."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-networkauth-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1f822132b1404e43e4df84dcd5838d68a0358a3e8af10f731bc92d2c3867c77ecaafb91dacec77b08da85c5a99f83e72ca13fe32e624a5aa55d8714ef30e62c3"

RPROVIDES:${PN} += "qt6-networkauth-examples qt6-networkauth-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6NetworkAuth.so.6()(64bit) libQt6NetworkAuth.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
