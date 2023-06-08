SUMMARY = "Development files for the libblockdev-loop plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_loop plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_loop-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "233b932bbf32c523d3f5114d12286c39633821b0e8d0396072c63568a5a309e040740f437b8545a67622c05dd3e4c9ca6846a485fa944ef6ae15d1f75d7effd9"

RPROVIDES:${PN} += "libbd_loop-devel libbd_loop-devel(aarch-64) libblockdev-loop-devel"
RDEPENDS:${PN} += "glib2-devel libbd_loop2 libbd_utils-devel"

inherit rpm
