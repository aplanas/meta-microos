SUMMARY = "Development files for libfsext, Extended File System (ext) library"
DESCRIPTION = "libfsext is a library to access the extended file system (ext) format.  see libfsext for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsext."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-devel-20230603-1.1.aarch64.rpm"
RPM_HASH = "c1a20c05dac7866353e5279f0cc9f85e172a438ea915e3515510a891026b0d0509646e6148f182ad90f758848379c29bc0f96f983d5f075484f4307e848ad664"

RPROVIDES:${PN} += "libfsext-devel libfsext-devel(aarch-64) pkgconfig(libfsext)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libfsext1"

inherit rpm
