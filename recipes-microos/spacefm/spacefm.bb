SUMMARY = "Multi-panel tabbed file and desktop manager"
DESCRIPTION = "SpaceFM is a multi-panel tabbed file and desktop manager for GNU/Linux \
with built-in VFS, udev-based device manager, customisable menu system \
and bash integration. SpaceFM is popular among novice and power users \
alike for its stability, speed, convenience and flexibility."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "spacefm-1.0.6-3.13.aarch64.rpm"
RPM_HASH = "bb43e8084d4ae9ee60f57eaae1e11a5db2fb27b337026c0c148f7c2b16d00adf70b4ee7ebf1ef55c78b99dc536433e45e28e3edcda5dbfb275ccdb62e7d8ccbf"

RPROVIDES:${PN} += "application() application(spacefm-find.desktop) application(spacefm-folder-handler.desktop) application(spacefm.desktop) config(spacefm) mimehandler(inode/directory) mimehandler(inode/mount-point) mimehandler(x-scheme-handler/ftp) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https) mimehandler(x-scheme-handler/mtp) mimehandler(x-scheme-handler/nfs) mimehandler(x-scheme-handler/ptp) mimehandler(x-scheme-handler/smb) mimehandler(x-scheme-handler/ssh) mimehandler(x-scheme-handler/webdav) spacefm spacefm(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libffmpegthumbnailer.so.4()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgthread-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
