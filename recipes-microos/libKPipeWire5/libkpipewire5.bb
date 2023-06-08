SUMMARY = "PipeWire integration for KDE Plasma - main library"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the main KPipeWire library."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "libKPipeWire5-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "9b95023948d0361f6e19fdaf21286440737ef0e3af0b84d2b5af10399dce5c285f1242a1a2b77eae2fe0c8edf16c43c9e5aaedbf1449199da37529c689025147"

RPROVIDES:${PN} += "libKPipeWire.so.5()(64bit) libKPipeWire5 libKPipeWire5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libpipewire-0.3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit)"

inherit rpm
