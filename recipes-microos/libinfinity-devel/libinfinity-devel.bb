SUMMARY = "Implementation of the Infinote collaborative editing protocol"
DESCRIPTION = "libinfinity is an implementation of the Infinote protocol written in \
GObject-based C. Infinote is a protocol for collaborative editing \
multiple documents and is portable to both Windows and Unix-like \
platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-devel-0.7.2-4.6.aarch64.rpm"
RPM_HASH = "42298df1cf6475b0f589166d2e2996ca0f95c61879dcb3af52eb02cebd0b5e2de13bcc9ed7fb0d23e146cff3f20b9502668812fe9dacd54da933a07b0e9c86bc"

RPROVIDES:${PN} += "libinfinity-devel libinfinity-devel(aarch-64) pkgconfig(libinfgtk-0.7) pkgconfig(libinfinity-0.7) pkgconfig(libinfinoted-plugin-manager-0.7) pkgconfig(libinftext-0.7) pkgconfig(libinftextgtk-0.7)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgnutls-devel libgsasl-devel libinfinity-0_7-0 pkgconfig(glib-2.0) pkgconfig(gnutls) pkgconfig(gobject-2.0) pkgconfig(gtk+-2.0) pkgconfig(gtk+-3.0) pkgconfig(libgsasl) pkgconfig(libinfinity-0.7) pkgconfig(libinftext-0.7) pkgconfig(libxml-2.0)"

inherit rpm
