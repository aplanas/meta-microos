SUMMARY = "CUPS library for working with large images"
DESCRIPTION = "The CUPS imaging library provides functions for managing large \
images, doing colorspace conversion and color management, scaling \
images for printing, and managing raster page streams. It is used by \
the CUPS image file filters, the PostScript RIP, and all raster \
printers drivers."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "libcupsimage2-2.4.2-4.3.aarch64.rpm"
RPM_HASH = "3a7161a700a24682d7da32d111483e5df01a0783c52f6f33dee77b54bb8f6de7642c059174454fba8b9f68ae52310272789757d31a9743c0bc39859df36a28e4"

RPROVIDES:${PN} += "libcupsimage.so.2()(64bit) libcupsimage2 libcupsimage2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libcups.so.2()(64bit)"

inherit rpm
