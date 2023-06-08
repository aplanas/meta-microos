SUMMARY = "Interface for media player KParts"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5MediaPlayer5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "9fa52397ce0c730c4a91e759eedd6d00d6a44e08dffab1435eb10056395246192a074e60a8500217937ef18cb860c567c4a94ea1f6fcd34c71feff517847b18a"

RPROVIDES:${PN} += "libKF5MediaPlayer.so.5()(64bit) libKF5MediaPlayer5 libKF5MediaPlayer5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Parts.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
