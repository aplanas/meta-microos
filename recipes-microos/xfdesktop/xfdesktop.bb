SUMMARY = "Desktop Manager for the Xfce Desktop Environment"
DESCRIPTION = "Xfdesktop is a desktop manager for the Xfce Desktop Environment which can set \
the background image, provides a right-click menu to launch applications and \
can optionally show files (including application launchers) or iconified \
windows, includes gradient support for background color, saturation support for \
background images, as well as real multiscreen and xinerama support."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfdesktop-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "cb9da39c6b5e1cf67961a96b18e7094b0fbf1c205cad69da6ff334c4d19ea5490e69f8f8d9918823c6247606d17b15ef57f500ddc76a0375dab5aa1f361d7f0d"

RPROVIDES:${PN} += "application() \
application(xfce-backdrop-settings.desktop) \
xfce4-desktop \
xfdesktop \
xfdesktop(aarch-64)"
RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libexo-2.so.0()(64bit) \
libgarcon-1.so.0()(64bit) \
libgarcon-data \
libgarcon-gtk3-1.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libthunarx-3.so.0()(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
xfdesktop-branding"

inherit rpm
