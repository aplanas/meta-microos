SUMMARY = "Qt 6 Quick3DGlslParser library"
DESCRIPTION = "The Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DGlslParser6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1ad019ff053c9d90739a17c92b031162904d98396ddd9fe9944cfe323a8e66378a6ef5261c57f460f765199a766854fd8791123493df0e29c585230e27bd4b81"

RPROVIDES:${PN} += "libQt6Quick3DGlslParser.so.6()(64bit) libQt6Quick3DGlslParser.so.6(Qt_6)(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.0)(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.1)(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.2)(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.3)(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.4)(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.5)(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DGlslParser6 libQt6Quick3DGlslParser6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
