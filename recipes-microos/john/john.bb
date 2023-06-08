SUMMARY = "Utility to detect weak passwords"
DESCRIPTION = "John the Ripper is a password cracker (password security auditing \
tool). Its primary purpose is to detect weak passwords, and a \
number of other hash types are supported to that end."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "john-1.9.0-8.4.aarch64.rpm"
RPM_HASH = "aa3e801a1aa5071175f6d3826551fdf2fab227b2d0b1b15246af0710afc57ebe83c601cde5e88880a7fdb4fb8b89d00c78c9f9935c2c20536d4850d2a35e03d7"

RPROVIDES:${PN} += "config(john) john john(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl /usr/bin/python /usr/bin/python2 /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcap.so.1()(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
