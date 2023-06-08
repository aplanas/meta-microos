SUMMARY = "Info Files for the GNU C Library"
DESCRIPTION = "This package contains the documentation for the GNU C library stored as \
info files. Due to a lack of resources, this documentation is not \
complete and is partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-info-2.37-3.1.noarch.rpm"
RPM_HASH = "01de92cbf57e9d54fe33e57e14eede12f4eb79aabfd78443e9035c3c20c733a626c32d367bdcd0d52575938230a3ff5f0a657c37fa4668211c59cbfcf265c869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-info"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
