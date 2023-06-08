SUMMARY = "Development files for libcreg, a Windows 9x/Me REGF-type Registry file parser"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcreg."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-devel-20210625-5.7.aarch64.rpm"
RPM_HASH = "95db7dd53ed5fbbd303a8fbc91c506ac51ed22ff5d255d272535f280ea88e56b923a3560c1554a3bac8d8721401a7cda4797fdbb6f8f8b63e8f63ae5eb8b0435"

RPROVIDES:${PN} += "libcreg-devel libcreg-devel(aarch-64) pkgconfig(libcreg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libcreg1"

inherit rpm
