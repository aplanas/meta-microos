SUMMARY = "KDE software to manage office documents in the office"
DESCRIPTION = "Kraft is KDE software to help to create and manage office documents such as \
offers and invoices in the small enterprise. \
 \
It supports easy document creation, templates with calculation, customer management \
through the KDE addressbook, highly configurable PDF output and more. \
 \
See the website http://volle-kraft-voraus.de for more information."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "kraft-1.0-2.1.aarch64.rpm"
RPM_HASH = "6b5d7ae0a213f420e752a3e76df3b13dbec7ce1f13be229ffa5e135cee061d8a932d7403f15b56a4f7a43d6e897597a5e9a60b57e3c6088fc3ed7c3d06c40535"

RPROVIDES:${PN} += "application() application(de.volle_kraft_voraus.kraft.desktop) kraft kraft(aarch-64) metainfo() metainfo(de.volle_kraft_voraus.kraft.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGrantlee_Templates.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql5-sqlite libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libctemplate.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python3-PyPDF2 python3-base python3-reportlab python3-six"

inherit rpm
