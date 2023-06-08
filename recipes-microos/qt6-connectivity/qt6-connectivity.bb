SUMMARY = "Qt 6 connectivity tools and libraries"
DESCRIPTION = "Qt 6 connectivity tools and libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-connectivity-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9ea1afdf78573b8e45e63b63ff42bbf05de4d34edfeb88b10f36139e0b85e221c90bbdf5686990585a74b602e6c53e95ec3cdb2cdcb19e84c32a70bdc5411819"

RPROVIDES:${PN} += "qt6-connectivity qt6-connectivity(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libbluetooth.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
