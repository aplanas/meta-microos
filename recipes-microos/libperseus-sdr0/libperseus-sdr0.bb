SUMMARY = "Library for Perseus SDR"
DESCRIPTION = "Perseus Software Defined Radio Control Library."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "libperseus-sdr0-0.8.1-1.22.aarch64.rpm"
RPM_HASH = "abdce388d3fddd87da6a2dbccc2095a8730a17aa8dd78d0aa6c244e60471e8c6e214caf19622158bc4866cedaaf74158e770d9ddd87ecdd58c74ad86a55c18e4"

RPROVIDES:${PN} += "libperseus-sdr.so.0()(64bit) libperseus-sdr0 libperseus-sdr0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperseus-sdr-udev libusb-1.0.so.0()(64bit)"

inherit rpm
