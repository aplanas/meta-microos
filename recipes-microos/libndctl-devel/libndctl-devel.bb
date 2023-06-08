SUMMARY = "Development files for libndctl"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table). \
 \
The ndctl-devel package contains libraries and header files for \
developing applications that use ndctl."
LICENSE = "LGPL-2.1-only"

PV = "76"

RPM_NAME = "libndctl-devel-76-1.3.aarch64.rpm"
RPM_HASH = "abea4806ff530436b01d71b365f33e1657bc8c502640ba3d29b0131893aa3c66c52bc12185f19191023167597cc16137971e6064fe50fb391ce84ed041674626"

RPROVIDES:${PN} += "libndctl-devel libndctl-devel(aarch-64) pkgconfig(libcxl) pkgconfig(libdaxctl) pkgconfig(libndctl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libndctl6"

inherit rpm
