SUMMARY = "User and system idle time reporting singleton"
DESCRIPTION = "KIdleTime is a singleton reporting information on idle time. It is useful not \
only for finding out about the current idle time of the PC, but also for getting \
notified upon idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5IdleTime5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "18be48565e365f3c770f87f95c5784726e3b8522fd2ff26bef08657afb66a77660dfd08a3385f763d99161e62e703265a7e29cae1676502f96969373c006cd93"

RPROVIDES:${PN} += "libKF5IdleTime.so.5()(64bit) libKF5IdleTime5 libKF5IdleTime5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5)(64bit) libQt5Widgets5 libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5X11Extras5 libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXss.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit) libxcb-sync.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
