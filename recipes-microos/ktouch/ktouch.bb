SUMMARY = "Touch Typing Tutor"
DESCRIPTION = "A KDE program that helps you to learn and practice touch typing."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktouch-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ddca5820aff4b0a89cb1a2fdde3ff7ec3d54cd02832ef4377c90faf50676f023ba317c72f34f20c1429308096acf7a25b378724ca48a888763a9beafc2458198"

RPROVIDES:${PN} += "application() application(org.kde.ktouch.desktop) kde4-ktouch ktouch ktouch(aarch-64) metainfo() metainfo(org.kde.ktouch.appdata.xml)"
RDEPENDS:${PN} += "kdeclarative-components kqtquickcharts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxcb-xkb.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
