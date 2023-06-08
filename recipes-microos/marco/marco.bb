SUMMARY = "MATE window manager"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "marco-1.26.1-1.3.aarch64.rpm"
RPM_HASH = "91b72addff896a9df91db453431eeb671f2c8b6cfc8dd22ea263ceef3d245c6e6773039c8d8e411038bf7a911fb693ef36c7c5bd304658afdbdf0c70b8837755"

RPROVIDES:${PN} += "application() application(marco.desktop) marco marco(aarch-64) mate-window-manager windowmanager"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmarco-private.so.2()(64bit) libpango-1.0.so.0()(64bit) zenity"

inherit rpm
