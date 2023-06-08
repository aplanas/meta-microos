SUMMARY = "Messageviewer header theme editor based on Grantlee"
DESCRIPTION = "A theme editor for messageviewer based on Grantlee. Once created or modified, \
the themes can be used in KMail."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "grantlee-editor-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "15122dd8ca6eb48e1d28842974b36ac1258961db9e61553ae78686ef10a6455c4e306732e83a68e63b63b6841c5eb44a1f33d954d4d6001953fdf00e512003fb"

RPROVIDES:${PN} += "application() application(org.kde.contactprintthemeeditor.desktop) application(org.kde.contactthemeeditor.desktop) application(org.kde.headerthemeeditor.desktop) grantlee-editor grantlee-editor(aarch-64) libgrantleethemeeditor.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig kaddressbook kmail-application-icons ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5SyntaxHighlighting.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiContact.so.5()(64bit) libKPim5GrantleeTheme.so.5()(64bit) libKPim5MessageViewer.so.5()(64bit) libKPim5Mime.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
