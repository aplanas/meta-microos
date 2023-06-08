SUMMARY = "An application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Crash5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "8327ea69e3413b912a48dcbc223063c79926ee6e120e0d46decfb7be2de793d14f8d110ae47d5ca6a4ad9ea4c361f1f822e4baa44277655d0b5901ecf8483963"

RPROVIDES:${PN} += "libKF5Crash.so.5()(64bit) libKF5Crash5 libKF5Crash5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit)"

inherit rpm
