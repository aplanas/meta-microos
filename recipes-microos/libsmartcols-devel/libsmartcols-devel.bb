SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libsmartcols-devel-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "83b5958e63c8f78a448e57e0b898097c48146b3bbef6de90bd85f8ceb7c4ed18387c795694af9746c9818b0ff0b067a5f79a78682601d91bd0d843eac815fb32"

RPROVIDES:${PN} += "libsmartcols-devel libsmartcols-devel(aarch-64) pkgconfig(smartcols)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsmartcols1"

inherit rpm
