SUMMARY = "Audio file converter, CD ripper and Replay Gain tool"
DESCRIPTION = "soundKonverter is a frontend to various audio converters."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "soundkonverter-3.0.1-1.14.aarch64.rpm"
RPM_HASH = "f2a63814e62041e192939828775dd44e574079537865dc3b044f79b36cd0985ed3854edd2bcf0df7cf6b231db5741f79929feb017a71f10b28353dad0e257192"

RPROVIDES:${PN} += "application() application(soundkonverter.desktop) libsoundkonvertercore.so()(64bit) metainfo() metainfo(soundkonverter.appdata.xml) soundkonverter soundkonverter(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig cdparanoia flac ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Cddb.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDELibs4Support.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5Solid.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdda_interface.so.0()(64bit) libcdda_paranoia.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libtag.so.1()(64bit) speex vorbis-tools wavpack"

inherit rpm
