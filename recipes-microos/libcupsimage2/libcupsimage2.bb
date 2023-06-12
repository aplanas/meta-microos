SUMMARY = "CUPS library for working with large images"
DESCRIPTION = "The CUPS imaging library provides functions for managing large \
images, doing colorspace conversion and color management, scaling \
images for printing, and managing raster page streams. It is used by \
the CUPS image file filters, the PostScript RIP, and all raster \
printers drivers."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "libcupsimage2-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "1cf7f115ecb021e6d022961468e00c5fce822f226396453f4f76bee627b81a53f0ea50e1aebf938de36b7d42d8e479f9f93dc47736a63142cc8cc88a5de5ffaa"

RPROVIDES:${PN} += "libcupsimage.so.2()(64bit) libcupsimage2 libcupsimage2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libcups.so.2()(64bit)"

inherit rpm
