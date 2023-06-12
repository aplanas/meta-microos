SUMMARY = "Libcinnamon-desktop API -- Development Files"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package contains development files for libcinnamon-desktop."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "libcinnamon-desktop-devel-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "590ec65727ecb21cbb8ac118e027f44cf2fc1f8ca26817b8ffecf7105ad17d7411362b5f9220ec057ad60214c913a3a40a55de2b1deb793bc9330ebbc284313a"

RPROVIDES:${PN} += "cinnamon-desktop-devel libcinnamon-desktop-devel libcinnamon-desktop-devel(aarch-64) pkgconfig(cinnamon-desktop)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcinnamon-desktop4 pkgconfig pkgconfig(gtk+-3.0) pkgconfig(xkbfile) typelib-1_0-CinnamonDesktop-3_0"

inherit rpm
