SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kguiaddons-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "353418f575b20333eb1682c82adf645cc42e16819c27c25a9c1a0b9d2dc0487a52fb038d537a988f322a0a39e72c4beeb95c61da3739369bf2e38a3188e200c1"

RPROVIDES:${PN} += "application() application(google-maps-geo-handler.desktop) application(openstreetmap-geo-handler.desktop) application(qwant-maps-geo-handler.desktop) application(wheelmap-geo-handler.desktop) kguiaddons kguiaddons(aarch-64) mimehandler(x-scheme-handler/geo)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5GuiAddons5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
