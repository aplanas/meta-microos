SUMMARY = "PipeWire integration for KDE Plasma - main library"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the main KPipeWire library."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "libKPipeWire5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "d98b0ae5939cc0f1c9be28a4747e243bf08f3bf8e953cc42866b731d3cf9a6b74430c6b3fdffd0469394b45b5160d52661b8544d974671c8733ca15f471c5b4f"

RPROVIDES:${PN} += "libKPipeWire.so.5()(64bit) libKPipeWire5 libKPipeWire5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libpipewire-0.3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit)"

inherit rpm
