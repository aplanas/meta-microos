SUMMARY = "Potato drawing editor"
DESCRIPTION = "KTuberling is a nice potato editor for kids. The game intended for \
small children. Of course, it may be suitable for adults who have \
remained young at heart. Eyes, mouths, mustache, and other parts of \
face and goodies can be attached onto a potato-like guy."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktuberling-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c72e2d4f077d9281ca886066cb3305348cd8bda2241a897f34d7c75dbf5f7921f5dd6ddb7a2dea5c315abbf8f27b3ea5d4b1c28ca05b236c947cebe2ebb6cfef"

RPROVIDES:${PN} += "application() application(org.kde.ktuberling.desktop) ktuberling ktuberling(aarch-64) ktuberling5 metainfo() metainfo(org.kde.ktuberling.appdata.xml) mimehandler(application/x-tuberling)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
