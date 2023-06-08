SUMMARY = "The LXDE file manager"
DESCRIPTION = "A file manager with tabbed browsing. It's also the \
LXDE default file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "pcmanfm-1.3.2-2.7.aarch64.rpm"
RPM_HASH = "12bac9db3b8f89a6c5f6f1498d18a6f0e871478cefeccd0b82cfea22f416c73dd144c6bfef07586f5fccf24fa0220aef4d640d77fea3994e98a2e5bd845c36ba"

RPROVIDES:${PN} += "application() application(pcmanfm-desktop-pref.desktop) application(pcmanfm.desktop) config(pcmanfm) mimehandler(inode/directory) pcmanfm pcmanfm(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gvfs gvfs-backends ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfm libfm-gtk.so.4()(64bit) libfm.so.4()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) menu-cache polkit-gnome xdg-utils"

inherit rpm
