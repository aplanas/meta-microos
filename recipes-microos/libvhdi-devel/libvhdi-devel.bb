SUMMARY = "Development files for libvhdi, a VHD image format library"
DESCRIPTION = "libvhdi is a library to access the Virtual Hard Disk (VHD) image format.  see libvhdi for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvhdi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-devel-20221124-3.7.aarch64.rpm"
RPM_HASH = "dac856e77cfa94d4d23ec74449a9fc5c95da965624244ec6c8d3aa681f1c37b0aa96b12aad7ac9c0ab6a47afc9fa897a77bf5d3def97b53b2bc3f588ab7fb5c7"

RPROVIDES:${PN} += "libvhdi-devel \
libvhdi-devel(aarch-64) \
pkgconfig(libvhdi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvhdi1"

inherit rpm
