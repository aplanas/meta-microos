SUMMARY = "Library of utility functions for CMPI providers"
DESCRIPTION = "Libcmpiutil is a library of utility functions for CMPI providers.  The \
goal is to reduce the amount of repetitive work done in most CMPI \
providers by encapsulating common procedures with more 'normal' APIs. \
This extends from operations like getting typed instance properties to \
standardizing method dispatch and argument checking."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.7"

RPM_NAME = "libcmpiutil-devel-0.5.7-9.3.aarch64.rpm"
RPM_HASH = "8385f5f79fbc4349ebcec26cc14ee701aa9ed01678d3468366ffcd5491af2be37172c9009b985b9808ca92a23c71ec0b79618b0b1a24a35bcad85a8b092b8d4a"

RPROVIDES:${PN} += "libcmpiutil-devel \
libcmpiutil-devel(aarch-64) \
pkgconfig(libcmpiutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmpiutil0 \
sblim-cmpi-devel"

inherit rpm
