SUMMARY = "Gallery application built using Kirigami"
DESCRIPTION = "Example application which uses all features from kirigami, \
including links to the sourcecode, tips on how to use the \
components and links to the corresponding HIG pages and \
code examples on cgit"
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kirigami-gallery-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "83f21977438aa3ed8240d575c6ed2e6f568ad350308e68c17be214447fac06dd33ee9d9fe7cdd75249c8cdb1633b47bed4df2a08c63dcc5d222d00ffb4be7e18"

RPROVIDES:${PN} += "application() application(org.kde.kirigami2.gallery.desktop) kirigami-gallery kirigami-gallery(aarch-64) metainfo() metainfo(org.kde.kirigami2.gallery.appdata.xml)"
RDEPENDS:${PN} += "kirigami2 kitemmodels-imports ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libqt5-qtgraphicaleffects libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
