SUMMARY = "libusb-1.0 Compatibility Library for libusb-0.1"
DESCRIPTION = "A compatibility layer allowing applications written for libusb-0.1 to \
work with libusb-1.0. libusb-compat-0.1 attempts to look, feel, smell \
and walk like libusb-0.1."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.1.13"

RPM_NAME = "libusb-0_1-4-0.1.13-38.1.aarch64.rpm"
RPM_HASH = "a8e448fc8aec269f3bee8cee013f9ef2efdae36fb8eb1892dc37f4afcf33da65e2051a15a7adeaaab0ab5d448f095f282ea8b0af8575ceac766d897bada1eb5a"

RPROVIDES:${PN} += "libusb libusb-0.1.so.4()(64bit) libusb-0_1-4 libusb-0_1-4(aarch-64) libusb-1_0-features-in-0_1-api"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
