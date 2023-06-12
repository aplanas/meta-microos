SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkcddb-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "87fccd209ed6014e0201cd2896f59b0881fa1b46f764ea965cd10fe4408a9bf0e8a5f1a4b69a083c61f8afc9cc04dbfe727433e3d2be036f968bc5b76f894da2"

RPROVIDES:${PN} += "application() application(kcm_cddb.desktop) libkcddb libkcddb(aarch-64) libkcddb16 libkcddb5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Cddb.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
