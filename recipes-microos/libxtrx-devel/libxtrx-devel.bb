SUMMARY = "Development files for libxtrx"
DESCRIPTION = "High level XTRX API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrx."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrx-devel-0.0.0+git.20201202-3.7.aarch64.rpm"
RPM_HASH = "f64b6fc9da3c21f78c0e10951545bc8f858d1492bba5e17754d985f4ec29f3c9d657482ab165bc89029bf7131e2bf9e6927d3056b367a1c64f60d83c29d5542b"

RPROVIDES:${PN} += "libxtrx-devel libxtrx-devel(aarch-64) pkgconfig(libxtrx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libxtrx0"

inherit rpm
