SUMMARY = "Development files for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package provides the development files to use libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-devel-0.8.3-12.5.aarch64.rpm"
RPM_HASH = "43e09b2429f096354e6ef63312afb200d8833445fff62a0ab10ec670407ff9d5c67a6d647fe95bb00a3373aa645c241f9421a66a414e023b53389020f6b85a03"

RPROVIDES:${PN} += "libgpod-devel libgpod-devel(aarch-64) pkgconfig(libgpod-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glib2-devel glibc-devel libgpod4 pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(libimobiledevice-1.0)"

inherit rpm
