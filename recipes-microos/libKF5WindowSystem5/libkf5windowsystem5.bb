SUMMARY = "KDE Access to window manager"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5WindowSystem5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "eed9e44e8456c2d608d8413289095822595197c7199d6fb6ad9a0355e0461dada0d1ac3af2bc8a741fbb7156b9ad88fcf274000a220bf27e6d4d5fc507a5dd55"

RPROVIDES:${PN} += "libKF5WindowSystem.so.5()(64bit) libKF5WindowSystem5 libKF5WindowSystem5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets5 libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5X11Extras5 libX11.so.6()(64bit) libXfixes.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxcb-keysyms.so.1()(64bit) libxcb-res.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
