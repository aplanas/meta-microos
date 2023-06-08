SUMMARY = "Daemon listening for wall and write messages"
DESCRIPTION = "KDE daemon listening for wall and write messages."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kwrited5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "442b6447be21e515c85590f105b85de0ee04c8be43d811544a78fd00c8e30f2a88849f8831253d71b02d65b99428e7a65be23a01697c3a666ca9503fdea56e31"

RPROVIDES:${PN} += "kwrited5 kwrited5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Pty.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
