SUMMARY = "Simple display manager (Deepin Desktop)"
DESCRIPTION = "A LightDM greeter that uses the Deepin Desktop. This is the reference implementation \
of a LightDM greeter based on the Deepin Desktop."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "lightdm-deepin-greeter-5.5.48-1.4.aarch64.rpm"
RPM_HASH = "fae73e6d8500c5d86d60ebb1c1bdd44be3063744b66f1a00e78cb6b73cf13c76a03707df241414b6389e23d34248dcb0360b292b6827fdf3723024f38b0cfe3a"

RPROVIDES:${PN} += "config(lightdm-deepin-greeter) lightdm-deepin-greeter lightdm-deepin-greeter(aarch-64)"
RDEPENDS:${PN} += "/bin/bash deepin-start ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXrandr.so.2()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdframeworkdbus.so.2()(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgnome-keyring0 libgsettings-qt.so.1()(64bit) liblightdm-qt5-3.so.0()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) lightdm"

inherit rpm
