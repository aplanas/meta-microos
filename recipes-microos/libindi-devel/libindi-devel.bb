SUMMARY = "Development files for libindi"
DESCRIPTION = "This package contains development files for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "libindi-devel-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "67ad54fe3e12acfe4c7ade3406b9354c17840ba9379a7fff8ad42bcff3238c7d8e65c69adf897505581c21d6e21a4ffb23f15e05ada0a1fe6ce69cbe529b98ca"

RPROVIDES:${PN} += "libindi-devel libindi-devel(aarch-64) pkgconfig(libindi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libindiAlignmentDriver2 libindiclient2 libindiclientqt2 libindidriver2 libindilx200-2"

inherit rpm
