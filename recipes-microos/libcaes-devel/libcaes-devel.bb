SUMMARY = "Development files for libcaes, a AES encryption library"
DESCRIPTION = "libcaes is a library for AES encryption. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcaes."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "libcaes-devel-20230406-1.1.aarch64.rpm"
RPM_HASH = "4028cfc151b81fb54428f71bddc65bab269ece229fcabfb33548365f57b44da7c02ac5f3a90242837b6e026a31db857d50a090a467cdf2ddaceb873707a65781"

RPROVIDES:${PN} += "libcaes-devel \
libcaes-devel(aarch-64) \
pkgconfig(libcaes)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcaes1"

inherit rpm
