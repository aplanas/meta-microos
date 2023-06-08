SUMMARY = "Qt 6 Core 5 Compat library"
DESCRIPTION = "The Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6Core5Compat6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "35c53506256e5ffabf9f068c9e45ade63032bdc84585d20b997a6ec3c6704293660922ae0331077955e3ba43ac0d3c911ca94ae4a8ae8391bd30c60fc1b6017e"

RPROVIDES:${PN} += "libQt6Core5Compat.so.6()(64bit) libQt6Core5Compat.so.6(Qt_6)(64bit) libQt6Core5Compat.so.6(Qt_6.0)(64bit) libQt6Core5Compat.so.6(Qt_6.1)(64bit) libQt6Core5Compat.so.6(Qt_6.2)(64bit) libQt6Core5Compat.so.6(Qt_6.3)(64bit) libQt6Core5Compat.so.6(Qt_6.4)(64bit) libQt6Core5Compat.so.6(Qt_6.5)(64bit) libQt6Core5Compat.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core5Compat6 libQt6Core5Compat6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
