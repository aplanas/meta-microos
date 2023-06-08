SUMMARY = "Development files for libvsmbr"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume systems. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsmbr."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr-devel-20210509-4.7.aarch64.rpm"
RPM_HASH = "760609e55b0c9947d0e848ce2c3c9ad97def91b7474ec3ba7c2f4f4d6a4c59d6eded9be2e92b66ea0b4812c3e11e6f9f92305bae31846a1208f83187ac5a2996"

RPROVIDES:${PN} += "libvsmbr-devel libvsmbr-devel(aarch-64) pkgconfig(libvsmbr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libvsmbr1"

inherit rpm
