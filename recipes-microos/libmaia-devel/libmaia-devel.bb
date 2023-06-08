SUMMARY = "Development files for libmaia"
DESCRIPTION = "The libmaia-devel package contains libraries and header files for \
developing applications that use libmaia."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "libmaia-devel-0.9.0-1.25.aarch64.rpm"
RPM_HASH = "a67ec3fccfc74b14c9be26753c6b73ff1a94e9014b3036df6e8fade4316c9877347f7756667ea7ed82fdba36f54015cf0cee5515b604521b664c1df65689643d"

RPROVIDES:${PN} += "libmaia-devel libmaia-devel(aarch-64) pkgconfig(maia)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmaia1"

inherit rpm
