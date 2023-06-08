SUMMARY = "YaST2 - Control Center (Qt Version)"
DESCRIPTION = "This package contains the menu selection component for YaST2 using the \
Qt toolkit."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-control-center-qt-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "d8bb8996f958ad32feecf067830f7b910eb83bff6b40399d987cbc34b7c67bef90343bf417466a0089d5d9e5504a4febe8e5c7c0fc88900f8fd74927c964d0de"

RPROVIDES:${PN} += "yast2-control-center-binary yast2-control-center-qt yast2-control-center-qt(aarch-64) yast2-control-center:/usr/lib/YaST2/bin/y2controlcenter"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg5 libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libyui-qt yast2-control-center"

inherit rpm
