SUMMARY = "Window Manager for the MATE and GNOME Flashback desktops"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-3.46.1-1.1.aarch64.rpm"
RPM_HASH = "ad0b2fd91b02f039f1dabb09bbea02114bec61e96e2b9c8e788460aae264b171579ab1c10a1607f0d2ed518cb7be26f75c482c56210896dccba30cb96c7336dd"

RPROVIDES:${PN} += "application() application(metacity.desktop) metacity metacity(aarch-64) windowmanager"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXRes.so.1()(64bit) libXcomposite.so.1()(64bit) libXcursor.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXinerama.so.1()(64bit) libXpresent.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgthread-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtop-2.0.so.11()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmetacity.so.3()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstartup-notification-1.so.0()(64bit) libvulkan.so.1()(64bit) libz.so.1()(64bit) zenity"

inherit rpm
