SUMMARY = "User and system idle time reporting singleton"
DESCRIPTION = "KIdleTime is a singleton reporting information on idle time. It is useful not \
only for finding out about the current idle time of the PC, but also for getting \
notified upon idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5IdleTime5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c58496686332f0c005d834aabb487ddb5227624d1daa8150c87ac5cd5bb4133a2dab959f4d9123660464e5b0f7434abce46ff277d0d4bbe5cb64d39b4ec5def0"

RPROVIDES:${PN} += "libKF5IdleTime.so.5()(64bit) \
libKF5IdleTime5 \
libKF5IdleTime5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libQt5Widgets5 \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5X11Extras5 \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXss.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-sync.so.1()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
