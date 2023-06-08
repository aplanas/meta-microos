SUMMARY = "Default Window Manager for the Xfce Desktop Environment"
DESCRIPTION = "xfwm4 is the default Xfce window manager which manages the placement of \
application windows on the screen, provides beautiful window decorations, \
manages workspaces or virtual desktops and natively supports multiscreen mode. \
It provides its own compositing manager for true transparency and shadows. The \
Xfce window manager also includes a keyboard shorcuts editor for user specific \
commands and basic windows manipulations and provides a preferences dialog for \
advanced tweaks."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfwm4-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "faa0eb92b765a4efefefc82eec0c5bbcf4e3f4d472f7a66f4be9163ac235c9785f56ae6154baa8dd02ee431a4b728be8859caa458f478a8fa894ecd0557a2ff5"

RPROVIDES:${PN} += "application() application(xfce-wm-settings.desktop) application(xfce-wmtweaks-settings.desktop) application(xfce-workspaces-settings.desktop) windowmanager xfwm4 xfwm4(aarch-64) xfwm4-doc"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXRes.so.1()(64bit) libXcomposite.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXinerama.so.1()(64bit) libXpresent.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libepoxy.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstartup-notification-1.so.0()(64bit) libwnck-3.so.0()(64bit) libxfce4kbd-private-3.so.0()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit)"

inherit rpm
