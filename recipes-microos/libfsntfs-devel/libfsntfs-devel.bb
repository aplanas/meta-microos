SUMMARY = "Development files for libfsntfs"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsntfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "libfsntfs-devel-20230427-1.1.aarch64.rpm"
RPM_HASH = "8237043fedfc1abb0e54de0a71827c2d6e05fef0d0babc9b0fb828889b11a70652eb6ca4b32be26b2bf7d5108f39b2537eff80982aab148fcd14893a1be60c7d"

RPROVIDES:${PN} += "libfsntfs-devel \
libfsntfs-devel(aarch-64) \
pkgconfig(libfsntfs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsntfs1"

inherit rpm
