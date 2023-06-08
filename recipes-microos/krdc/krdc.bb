SUMMARY = "Remote Desktop Connection"
DESCRIPTION = "Krdc allows to connect to VNC and RDP compatible servers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "krdc-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b13fc25cf909d68735e52f901ed14e734f38c4c71850c8276ffac7abecffadca7f2b9cc2f0b4d93e8e99e9c7cac1c36fe635e725c8b3981374690c8301e3311b"

RPROVIDES:${PN} += "application() application(org.kde.krdc.desktop) krdc krdc(aarch-64) libkcm_krdc_rdpplugin.so()(64bit) libkcm_krdc_vncplugin.so()(64bit) libkrdc_rdpplugin.so()(64bit) libkrdc_testplugin.so()(64bit) libkrdc_vncplugin.so()(64bit) libkrdccore.so.5()(64bit) metainfo() metainfo(org.kde.krdc.appdata.xml) mimehandler(x-scheme-handler/rdp) mimehandler(x-scheme-handler/vnc)"
RDEPENDS:${PN} += "/sbin/ldconfig breeze5-icons freerdp ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Bookmarks.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libvncclient.so.1()(64bit)"

inherit rpm
