SUMMARY = "Integration of Android with Linux desktops"
DESCRIPTION = "A package for integration of Android with Linux desktops. \
 \
Current feature list: \
- Clipboard share: copy from or to your desktop \
- Notifications sync (4.3+): Read your Android notifications \
- Multimedia remote control: Use your phone as a remote control \
- WiFi connection: no USB wire or Bluetooth needed \
- RSA Encryption: your information is safe \
 \
Please note you will need to install KDE Connect on Android for this app to work: \
https://play.google.com/store/apps/details?id=org.kde.kdeconnect_tp or \
https://f-droid.org/en/packages/org.kde.kdeconnect_tp/"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdeconnect-kde-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "e6bd5d1b56d82b692ffe48ad9d3771f39767aedb05f753f7141ee6860736d945e24a751a6889aaad519ac50f03b74044733c89d4c624796f34b6c330601d1a3f"

RPROVIDES:${PN} += "application() \
application(kcm_kdeconnect.desktop) \
application(org.kde.kdeconnect-settings.desktop) \
application(org.kde.kdeconnect.app.desktop) \
application(org.kde.kdeconnect.daemon.desktop) \
application(org.kde.kdeconnect.handler.desktop) \
application(org.kde.kdeconnect.nonplasma.desktop) \
application(org.kde.kdeconnect.sms.desktop) \
application(org.kde.kdeconnect_open.desktop) \
kdeconnect-kde \
kdeconnect-kde(aarch-64) \
libkdeconnectcore.so.23()(64bit) \
libkdeconnectdeclarativeplugin.so()(64bit) \
libkdeconnectinterfaces.so.23()(64bit) \
libkdeconnectpluginkcm.so.23()(64bit) \
metainfo() \
metainfo(org.kde.kdeconnect.appdata.xml) \
metainfo(org.kde.kdeconnect.metainfo.xml) \
mimehandler(application/octet-stream) \
mimehandler(x-scheme-handler/sms) \
mimehandler(x-scheme-handler/tel) \
qt5qmlimport(org.kde.kdeconnect.1)"
RDEPENDS:${PN} += "/bin/sh \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5ModemManagerQt.so.6()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5People.so.5()(64bit) \
libKF5PulseAudioQt.so.3()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfakekey.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libqca-qt5.so.2()(64bit) \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_1.0.0)(64bit) \
plasma-framework-components \
qt5qmlimport(Qt.labs.platform.1) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kdeconnect.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
sshfs"

inherit rpm
