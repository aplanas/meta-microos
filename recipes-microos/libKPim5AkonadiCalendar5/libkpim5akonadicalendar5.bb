SUMMARY = "KDE PIM Libraries: AkonadiCalendar"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5AkonadiCalendar5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "554c58153e7f663d981b90f7cfad33dc7d278a4bf2ccca6ca7a62ae1100f9746b23a8619b63a0df57430f7f861141180108d3356e3ed2e6f967ab6aecf61d55f"

RPROVIDES:${PN} += "libKPim5AkonadiCalendar.so.5()(64bit) libKPim5AkonadiCalendar5 libKPim5AkonadiCalendar5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5MailTransport.so.5()(64bit) libKPim5MailTransportAkonadi.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
