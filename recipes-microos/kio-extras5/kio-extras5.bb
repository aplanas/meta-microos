SUMMARY = "Additional KIO slaves for KDE applications"
DESCRIPTION = "Additional KIO-slaves for KDE applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kio-extras5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "84029e0fea5ee2e362c6f037ddf951eafdb69806e5200071856740b6225e629ddf971729e068b335144c54c4fc098bad37db9179143d427a52abd67f6dea0852"

RPROVIDES:${PN} += "kde-odf-thumbnail kfileaudiopreview kio-extras5 kio-extras5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5ActivitiesStats.so.1()(64bit) libKF5Archive.so.5()(64bit) libKF5Bookmarks.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5Solid.so.5()(64bit) libKF5SyntaxHighlighting.so.5()(64bit) libOpenEXR-3_1.so.30()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkdsoap.so.2()(64bit) libkioarchive.so.5()(64bit) libmtp.so.9()(64bit) libphonon4qt5.so.4()(64bit) libsmbclient.so.0()(64bit) libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) libsmbclient.so.0(SMBCLIENT_0.2.3)(64bit) libsmbclient.so.0(SMBCLIENT_0.6.0)(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libssh.so.4(LIBSSH_4_7_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libtag.so.1()(64bit)"

inherit rpm
