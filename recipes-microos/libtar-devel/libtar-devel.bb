SUMMARY = "Development files for libtar"
DESCRIPTION = "libtar is a C library for manipulating POSIX tar files. It handles adding \
and extracting files to/from a tar archive. \
 \
This package contains devel files for libtar."
LICENSE = "BSD-3-Clause"

PV = "1.2.20"

RPM_NAME = "libtar-devel-1.2.20-2.16.aarch64.rpm"
RPM_HASH = "62b8c0be24797ce08ea7a941de42dfb389fce1245a215d1256be1a27e09a126a26e3cc77be2eac148f1cdc3df43acd879dcf8d2e9a84ef6e2177db2856332fdc"

RPROVIDES:${PN} += "libtar-devel libtar-devel(aarch-64)"
RDEPENDS:${PN} += "libtar"

inherit rpm
