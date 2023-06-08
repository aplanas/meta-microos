SUMMARY = "Development files for libmodi"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-devel-20221023-3.7.aarch64.rpm"
RPM_HASH = "bcdf56813356038bdf302fb31c73d5dbe2229d06f63cd3719924a4d16baf2c4ae002489f4737b1a6a741e5308cc9e83f44780e2afafd641ef382cdab1391f35f"

RPROVIDES:${PN} += "libmodi-devel libmodi-devel(aarch-64) pkgconfig(libmodi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libmodi1"

inherit rpm
