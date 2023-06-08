SUMMARY = "Library for Decoding and Generating MPEG TS and DVB PSI Tables"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
   MPEG TS and DVB PSI tables. Current features: * Program \
   Association Table (PAT), decoder and generator. \
 \
* Program Map Table (PMT), decoder and generator. \
* All MPEG 2 descriptors, decoders and generators."
LICENSE = "LGPL-2.1+"

PV = "0.2.2"

RPM_NAME = "libdvbpsi7-0.2.2-6.26.aarch64.rpm"
RPM_HASH = "0b9f702d8140f69a079e212338bd12c3adf56ab2d5cc683fc575095a74cac2f47dc4995da683b87adb60d2e163f1bf463510110bd3496296412e79d9e12f5448"

RPROVIDES:${PN} += "libdvbpsi.so.7()(64bit) libdvbpsi7 libdvbpsi7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
