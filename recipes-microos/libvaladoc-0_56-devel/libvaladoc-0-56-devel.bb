SUMMARY = "Development files for the valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code. \
 \
This package contains the libvaladoc development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "libvaladoc-0_56-devel-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "81c2e6061ca14faf3b10437ef307e031c94fd2e2c3ac474e1c9734d84b3f5b71a9d7decc85d972695fba461b41d1029a50a0ee83b03b46b9dcaed7e06f84187d"

RPROVIDES:${PN} += "libvaladoc-0_56-devel libvaladoc-0_56-devel(aarch-64) libvaladoc-devel pkgconfig(valadoc-0.56)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvaladoc-0_56-0 pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(libgvc) pkgconfig(libvala-0.56)"

inherit rpm
