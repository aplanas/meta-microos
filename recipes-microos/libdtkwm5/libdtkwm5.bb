SUMMARY = "Dtkwm libraries"
DESCRIPTION = "DtkWm is used to handle double screen for deepin desktop development. \
This package contains the shared libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.12"

RPM_NAME = "libdtkwm5-2.0.12-2.10.aarch64.rpm"
RPM_HASH = "b1f92fab68f9a92a42c5d27168f4e2f9ca4145930b38b270fe9b1aa98712b97e1f6998108698525a949010e9dcc53a99b312d18cfdbcfea0fe51da3a801dbeec"

RPROVIDES:${PN} += "libdtkwm.so.5()(64bit) libdtkwm5 libdtkwm5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdtkcore.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxcb.so.1()(64bit)"

inherit rpm
