SUMMARY = "Development files for the libblockdev-part plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_part plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_part-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "546da90bed38327b0f5d9454a1725dc599f4e781b5327028489eac0ac484f8acc45f9aa31b31b4231c8ca4ab1ea532ed0baf51525a9578c68aadc398d7918a28"

RPROVIDES:${PN} += "libbd_part-devel libbd_part-devel(aarch-64) libblockdev-part-devel"
RDEPENDS:${PN} += "glib2-devel libbd_part2 libbd_utils-devel"

inherit rpm
