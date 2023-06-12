SUMMARY = "Vocabulary Trainer"
DESCRIPTION = "A flashcard and vocabulary learning program."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwordquiz-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5e2168cfae096d71e594e25c3417eadd503b127fb74d1ba60096470bd59d9025006fb5b67741c972bb7b5f4622f635cd72440cd4b40360c392fbbe3fb017427b"

RPROVIDES:${PN} += "application() application(org.kde.kwordquiz.desktop) kwordquiz kwordquiz(aarch-64) kwordquiz5 metainfo() metainfo(org.kde.kwordquiz.appdata.xml) mimehandler(application/x-kvtml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKEduVocDocument.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NewStuff.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
