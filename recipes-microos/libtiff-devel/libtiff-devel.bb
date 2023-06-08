SUMMARY = "Development Tools for Programs which will use the libtiff Library"
DESCRIPTION = "This package contains the header files and static libraries for \
developing programs which will manipulate TIFF format image files using \
the libtiff library."
LICENSE = "HPND"

PV = "4.5.0"

RPM_NAME = "libtiff-devel-4.5.0-3.3.aarch64.rpm"
RPM_HASH = "bc54db990f034f1291824ab704047b84710f361b6b6036d0bf93bb3daffac9cc480f4317f89eac3dd7db6833d662c0250b9534dfd28d24e198ebaf26def35ed8"

RPROVIDES:${PN} += "libtiff-devel libtiff-devel(aarch-64) pkgconfig(libtiff-4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libstdc++-devel libtiff6 pkgconfig(libjpeg) pkgconfig(liblzma) pkgconfig(libzstd) pkgconfig(zlib)"

inherit rpm
