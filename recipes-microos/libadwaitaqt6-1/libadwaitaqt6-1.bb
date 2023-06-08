SUMMARY = "Adwaita Qt6 library"
DESCRIPTION = " \
 \
 \
 \
Adwaita theme variant for applications utilizing Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaitaqt6-1-1.4.2-3.3.aarch64.rpm"
RPM_HASH = "b05c3fdb39fdf061b8be14ea1025cb11a9374690b59802f7b3b33da04e43eafd40ce5a8bcebcf6d3b4513165c0abcb82e3fee03a7e5667203b94d57895818d1b"

RPROVIDES:${PN} += "libadwaitaqt6-1 libadwaitaqt6-1(aarch-64) libadwaitaqt6.so.1()(64bit) libadwaitaqt6priv.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
