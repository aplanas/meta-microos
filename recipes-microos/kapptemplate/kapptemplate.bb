SUMMARY = "Template for KDE Application Development"
DESCRIPTION = "This package contains templates to start the development of a new KDE \
application/part/plugin."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kapptemplate-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "61eea8ab47863d949f2eca8f03c00b8fa5af56b7c2afbb28c48b444f166c33703e7d6adba1578cecd83fd79a742dc23867bd2a8f94bea99daec272092411da4c"

RPROVIDES:${PN} += "application() application(org.kde.kapptemplate.desktop) kapptemplate kapptemplate(aarch-64) kapptemplate5 metainfo() metainfo(org.kde.kapptemplate.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
