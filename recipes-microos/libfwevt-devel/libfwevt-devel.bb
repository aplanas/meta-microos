SUMMARY = "Development files for libfwevt"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230410"

RPM_NAME = "libfwevt-devel-20230410-1.1.aarch64.rpm"
RPM_HASH = "cac765d19f52200701c09e11ff9d6e08c5f722cfee7b2db75ab6670d3841c6d6b6c9e9995b7c01559fe7f195d33303b6cd511489f19f51340d677111a74ba225"

RPROVIDES:${PN} += "libfwevt-devel \
libfwevt-devel(aarch-64) \
pkgconfig(libfwevt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwevt1"

inherit rpm
