SUMMARY = "Data exporter for KDE PIM applications"
DESCRIPTION = "This package contains utlities needed by KDE PIM applications to export data \
for backup and archival."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "pim-data-exporter-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7c9541b2008b8e301bf9c9407d815f933338534945459079c4bcb46562610b66cf36127e23e111c2543898c28a68f9f86514648686012b21cc135d84e883cc69"

RPROVIDES:${PN} += "application() application(org.kde.pimdataexporter.desktop) libpimdataexporterprivate.so.5()(64bit) metainfo() metainfo(org.kde.pimdataexporter.appdata.xml) pim-data-exporter pim-data-exporter(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kontact ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5CalendarCore.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5PimCommonAkonadi.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libKPim5AkonadiNotes.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5MailCommon.so.5()(64bit) libKPim5MailTransport.so.5()(64bit) libKPim5Mime.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libKUserFeedbackCore.so.1()(64bit) libKUserFeedbackWidgets.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
