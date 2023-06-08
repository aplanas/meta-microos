SUMMARY = "Development files for the libbd_kbd plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_kbd plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_kbd-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "a96803151e4f5c40bf5fd89e0758600fa06e77c0ecd5dbef9004fb4e0731c003cc17c25fa3fdf12d411dc8e641c7113de7da6c9cb08b55a138198121ef2794e9"

RPROVIDES:${PN} += "libbd_kbd-devel libbd_kbd-devel(aarch-64) libblockdev-kbd-devel"
RDEPENDS:${PN} += "glib2-devel libbd_kbd2 libbd_utils-devel"

inherit rpm
