SUMMARY = "Development files for libcdatetime, a PFF/OFF file format library"
DESCRIPTION = "libcdatetime is a library C date and time functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdatetime."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libcdatetime-devel-20230115-1.2.aarch64.rpm"
RPM_HASH = "acc31c23b3f5a202b704fb5028dedea71c3fdbc61ba5e69d500374343dded899fdd1fcdd98a0fa33a330101ce4bc8ab71194218502c1ed37fa1e8261e967c241"

RPROVIDES:${PN} += "libcdatetime-devel libcdatetime-devel(aarch-64) pkgconfig(libcdatetime)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcdatetime1"

inherit rpm
