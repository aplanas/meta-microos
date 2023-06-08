SUMMARY = "Libcinnamon-desktop API -- Development Files"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package contains development files for libcinnamon-desktop."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "libcinnamon-desktop-devel-5.6.2-1.1.aarch64.rpm"
RPM_HASH = "e610f8ea34d404ae5b16d182532b1d5a45d7e5636532a29422af09d29cc09a68bceab94f6ff149cf342fab469e78d5a8d2259cda6731d0b7c3dc3fd8cab25019"

RPROVIDES:${PN} += "cinnamon-desktop-devel libcinnamon-desktop-devel libcinnamon-desktop-devel(aarch-64) pkgconfig(cinnamon-desktop)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcinnamon-desktop4 pkgconfig pkgconfig(gtk+-3.0) pkgconfig(xkbfile) typelib-1_0-CinnamonDesktop-3_0"

inherit rpm
