SUMMARY = "Incidenceeditor Library"
DESCRIPTION = "The IncidenceEditor library for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5IncidenceEditor5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2410d29f09025e0a13ae35586e9f226c178f01570658ba47dd0a902704e5bf8b44e1bb61da06ace62849429e35db7a602fb7aecc9a3f854dc040338efd977ddf"

RPROVIDES:${PN} += "libKPim5IncidenceEditor.so.5()(64bit) libKPim5IncidenceEditor5 libKPim5IncidenceEditor5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig incidenceeditor ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5PimCommonAkonadi.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKGantt.so.2()(64bit) libKPim5AkonadiCalendar.so.5()(64bit) libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5CalendarSupport.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libKPim5EventViews.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5Ldap.so.5()(64bit) libKPim5Libkdepim.so.5()(64bit) libKPim5MailTransportAkonadi.so.5()(64bit) libKPim5Mime.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
