SUMMARY = "Files for Developing with libmwaw"
DESCRIPTION = "Libmwaw is a new project for converting many pre-OSX MAC text formats. \
This package contains the libmwaw development files."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-devel-0.3.21-2.9.aarch64.rpm"
RPM_HASH = "b0a483b1716f4e23268650cffa652bf58e6a5c6f6ad78fb0705a60145cd57507638f94d128a40ca25e8e083ed28dc5ec5f7ab314aae66f4f752f47ce64d19294"

RPROVIDES:${PN} += "libmwaw-devel \
libmwaw-devel(aarch-64) \
pkgconfig(libmwaw-0.3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmwaw-0_3-3 \
pkgconfig(librevenge-0.0) \
pkgconfig(librevenge-stream-0.0)"

inherit rpm
