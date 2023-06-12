SUMMARY = "GNOME Music Management Application -- Development Files"
DESCRIPTION = "Music Management application with support for ripping audio-CD's, \
playback of Ogg Vorbis and MP3 and burning of CD-ROMs. \
 \
This package contains the development requirements to extend rhythmbox."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.7"

RPM_NAME = "rhythmbox-devel-3.4.7-1.1.aarch64.rpm"
RPM_HASH = "5dec36048d116678d42e6ce74bb9b948e90457a5ed6d14042d5f1763f61256e01b3c06793e9f06d3ec7d90917f97176ec4f8e02ea9332fce5b8a920858eb7f99"

RPROVIDES:${PN} += "pkgconfig(rhythmbox) \
rhythmbox-devel \
rhythmbox-devel(aarch-64) \
rhythmbox-doc"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libsoup-3.0) \
pkgconfig(libxml-2.0) \
pkgconfig(totem-plparser) \
rhythmbox"

inherit rpm
