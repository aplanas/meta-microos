SUMMARY = "Utility to detect weak passwords"
DESCRIPTION = "John the Ripper is a password cracker (password security auditing \
tool). Its primary purpose is to detect weak passwords, and a \
number of other hash types are supported to that end."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "john-1.9.0-9.1.aarch64.rpm"
RPM_HASH = "ff8e9069652e4f6bdd9ba8b694cba339d89280a911cc3981c1a3437e9509df54e595cad3262af5feca91bd34e61e0a5b5ce3c4bc80ae169942921ef3d3e1648a"

RPROVIDES:${PN} += "config(john) john john(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcap.so.1()(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
