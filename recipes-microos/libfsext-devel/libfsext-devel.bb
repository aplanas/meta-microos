SUMMARY = "Development files for libfsext, Extended File System (ext) library"
DESCRIPTION = "libfsext is a library to access the extended file system (ext) format.  see libfsext for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsext."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsext-devel-20220829-3.9.aarch64.rpm"
RPM_HASH = "9b15aecc91808b45ef28226c43e9a0aa23d7a22d7555ebe74088ac7f7bbdeeae9a9bc29809195b63d5cf7a6a48f0339522ae95ba47188a161eeab1b8ec5f6f2f"

RPROVIDES:${PN} += "libfsext-devel libfsext-devel(aarch-64) pkgconfig(libfsext)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libfsext1"

inherit rpm
