SUMMARY = "Popup Notes"
DESCRIPTION = "KNotes is a note taking application by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "knotes-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d5583d46e26073cc539ef6f0ddb508737fe5e75cf607233747e54071310439eb7cb5d718d866485da023c04cb04b6a74367ee48b770cba6df83cdd8e63ee9cfd"

RPROVIDES:${PN} += "application() application(org.kde.knotes.desktop) knotes knotes(aarch-64) knotes5 libknotesprivate.so.5()(64bit) libnotesharedprivate.so.5()(64bit) metainfo() metainfo(org.kde.knotes.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5NewStuff.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5PimCommonAkonadi.so.5()(64bit) libKF5TextAutoCorrection.so.1()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiAgentBase.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiNotes.so.5()(64bit) libKPim5AkonadiSearchDebug.so.5()(64bit) libKPim5AkonadiSearchPIM.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libKPim5GrantleeTheme.so.5()(64bit) libKPim5KontactInterface.so.5()(64bit) libKPim5Mime.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
