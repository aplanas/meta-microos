SUMMARY = "KDE Text Editor"
DESCRIPTION = "KWrite is a text editor by KDE."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "kwrite-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a493eee0d3be29e34ab6607cc35b156388e83298f74264cd0ebf05bdaf67c41633ce9c3c25cdf2dc986996b1977eb3ccfb9fa452c2e645404a5baf56bf93a27b"

RPROVIDES:${PN} += "application() application(org.kde.kwrite.desktop) kwrite kwrite(aarch-64) metainfo() metainfo(org.kde.kwrite.appdata.xml) mimehandler(text/plain)"
RDEPENDS:${PN} += "kate-plugins ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkateprivate.so.23.04.0()(64bit)"

inherit rpm
