SUMMARY = "Development files for libpfs, a library for HDR image and video manipulation"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpfs."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-devel-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "50d476337c81b6a43ceae6dedf6852e481cb05279771e42fab51ff9c4bb230c41100c540954e45639076d68529bb59e13242b405adb0893878c33af6f0393074"

RPROVIDES:${PN} += "pfstools-devel pfstools-devel(aarch-64) pkgconfig(pfs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpfs2"

inherit rpm
