SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libblkid-devel-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "527804e1c3dc5393f21300275e972680b88fe4fddd948b32483e113e1d9840760e169d1bf4b93d4a9d025086283b691e07065d41e693dab5fe0484767d80e741"

RPROVIDES:${PN} += "libblkid-devel libblkid-devel(aarch-64) pkgconfig(blkid)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libblkid1"

inherit rpm
