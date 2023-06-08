SUMMARY = "Development files for libevtx, a Windows XML Event file parser"
DESCRIPTION = "libevtx is a library to access the Windows XML Event log format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevtx."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx-devel-20221101-3.10.aarch64.rpm"
RPM_HASH = "5e1a668291b119c10a85cb12fb096270f662aa1c32c414a7fd884eb7965080ca1cbfa6171679468e7ce9274539f210f9d5f86865061d6f94d5f7c09eaee5850d"

RPROVIDES:${PN} += "libevtx-devel libevtx-devel(aarch-64) pkgconfig(libevtx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libevtx1"

inherit rpm
