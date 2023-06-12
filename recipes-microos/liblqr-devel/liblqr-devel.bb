SUMMARY = "Development files for the Liquid Rescale library"
DESCRIPTION = "The Liquid Rescale (lqr) library provides a C/C++ API for performing \
non-uniform resizing of images by the seam-carving technique. \
 \
This package contains the development files for liblqr."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "liblqr-devel-0.4.2-7.3.aarch64.rpm"
RPM_HASH = "e8fb860dab9aacba5cb93daeb64b0063439b4c4e5529639ec758a5613c4dafa93fe94d2650e1b98bb11a9f262164e3834d3a6b8dc10d2b34f000bd4bb75949ca"

RPROVIDES:${PN} += "liblqr-devel \
liblqr-devel(aarch-64) \
pkgconfig(lqr-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblqr-1-0 \
pkgconfig(glib-2.0)"

inherit rpm
