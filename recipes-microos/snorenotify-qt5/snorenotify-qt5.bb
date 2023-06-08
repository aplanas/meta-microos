SUMMARY = "Snorenotify is a multi platform Qt based notification framework"
DESCRIPTION = "Snorenotify is a multi platform Qt based notification framework. Using a plugin system it is possible to create notifications with many different notification systems on Windows, Unix and Mac."
LICENSE = "LGPL-3.0"

PV = "0.7.0"

RPM_NAME = "snorenotify-qt5-0.7.0-2.34.aarch64.rpm"
RPM_HASH = "df9bd215011a258bd3c523a3de34b593f3366199366d3407b8824d40c35d98d7ea049711983df229ed71811a79b26fe075b622854c9ea69c9600c2c2a2cced36"

RPROVIDES:${PN} += "application() application(snorenotify.desktop) application(snoresettings.desktop) libsnore-qt5.so.0.7()(64bit) libsnore_backend_freedesktop.so()(64bit) libsnore_backend_snore.so()(64bit) libsnore_backend_trayicon.so()(64bit) libsnore_frontend_freedesktop.so()(64bit) libsnore_frontend_pushover.so()(64bit) libsnore_frontend_snarlnetwork.so()(64bit) libsnore_secondarybackend_nma.so()(64bit) libsnore_secondarybackend_puhover.so()(64bit) libsnore_secondarybackend_sound.so()(64bit) libsnore_secondarybackend_toasty.so()(64bit) libsnore_settings_backend_snore.so()(64bit) libsnore_settings_frontend_pushover.so()(64bit) libsnore_settings_secondarybackend_nma.so()(64bit) libsnore_settings_secondarybackend_puhover.so()(64bit) libsnore_settings_secondarybackend_sound.so()(64bit) libsnore_settings_secondarybackend_toasty.so()(64bit) libsnoresettings-qt5.so.0.7()(64bit) snorenotify-qt5 snorenotify-qt5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5WebSockets.so.5()(64bit) libQt5WebSockets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
