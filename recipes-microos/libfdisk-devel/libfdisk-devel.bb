SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libfdisk-devel-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "473c6462b6d0abc6de6a152200091bea7e5a322906ac15759398677328bdf94455b69f564c47622ca3c203b51e1e2c9f0628904b94373295e927fd3b25a44d6f"

RPROVIDES:${PN} += "libfdisk-devel libfdisk-devel(aarch-64) pkgconfig(fdisk)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfdisk1 pkgconfig(blkid) pkgconfig(uuid)"

inherit rpm
