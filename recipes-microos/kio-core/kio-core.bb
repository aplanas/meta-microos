SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
KIO core libraries, ioslave and daemons."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kio-core-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "032f3de21cbfb9bafccfe6bff2bdaf16181a734fbc7aff46d3d07c1f7f3d7e1c6f469455cdd6260cd982fe9215eddda4b25b8cb0ecefade568ccf115c7b74222"

RPROVIDES:${PN} += "application() application(kcm_trash.desktop) application(ktelnetservice5.desktop) kio-core kio-core(aarch-64) libKF5KIOCore.so.5()(64bit) libKF5KIONTLM.so.5()(64bit) mimehandler(x-scheme-handler/rlogin) mimehandler(x-scheme-handler/ssh) mimehandler(x-scheme-handler/telnet)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5AuthCore.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5DocTools.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexslt.so.0()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.21)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
