SUMMARY = "Daemon listening for wall and write messages"
DESCRIPTION = "KDE daemon listening for wall and write messages."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kwrited5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "f6d42581f6a35cf2049d58910b69a3fd6711ff03e25834f28d267e1f0257abb46df1c5f1a8406dca28b32287fab7789d6cd27ce8583880d85da42c99c02a4a77"

RPROVIDES:${PN} += "kwrited5 \
kwrited5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Pty.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
