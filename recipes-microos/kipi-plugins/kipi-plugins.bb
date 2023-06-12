SUMMARY = "KDE Plug-Ins for Image Manipulation"
DESCRIPTION = "A set of plug-ins for the KDE KIPI interface, used by some KDE imaging \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kipi-plugins-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "dddcc008b2a4db25ba78ada45c80f45b4fe941d525c18186ff0354d22cd9e8ee0e13b496a5c31f5a0184faa92d9c5b1ec9be082531170f0e7e99565319bb5056"

RPROVIDES:${PN} += "application() application(kipiplugins.desktop) kipi-plugin-icons kipi-plugins kipi-plugins(aarch-64) kipi-plugins5 libKF5kipiplugins.so.5.9.1()(64bit) metainfo() metainfo(org.kde.kipi_plugins.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Kipi.so.32.0.0()(64bit) libKF5MediaWiki.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
