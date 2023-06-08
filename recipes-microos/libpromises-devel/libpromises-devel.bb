SUMMARY = "Development package for libpromises"
DESCRIPTION = "A character set detection library. \
 \
This package contains the files needed to compile programs that use the \
libpromises library."
LICENSE = "GPL-3.0-only"

PV = "3.21.0"

RPM_NAME = "libpromises-devel-3.21.0-1.4.aarch64.rpm"
RPM_HASH = "47e01242e2a42f5cb694406b8d786b90be05b89eebf6eea00a6af1820544e3dc8a0c7f3ffb2ebb20fd254a94f57c0304bec8c685db2924f90bfaa9499cb649fa"

RPROVIDES:${PN} += "cfengine-devel libpromises-devel libpromises-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libpromises3"

inherit rpm
