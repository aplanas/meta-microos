SUMMARY = "Library for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libcdda_interface0-3.10.2-28.19.aarch64.rpm"
RPM_HASH = "1ecc8016e2239cb184bafcfedf4835618b2f1a2414418f39d5c17ba5465eebdcf8d32228c2be53055c2fe5ab3ecd1e40efd20df6153f64a308d410c12aadfc35"

RPROVIDES:${PN} += "libcdda_interface.so.0()(64bit) \
libcdda_interface0 \
libcdda_interface0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
