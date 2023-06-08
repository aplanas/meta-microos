SUMMARY = "Cryptographic Tools"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
This package contains a few command-line tools to perform cryptographic \
operations using the nettle library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "nettle-3.8.1-2.3.aarch64.rpm"
RPM_HASH = "0376477f57fd1f52e4989aac85707d7d50d81478d56b3e6e0e42fc330cae94e3dc3fd42f96e9d66ae80537a4c3f4b12e43d37a136801efa24055618b7a9cdbf1"

RPROVIDES:${PN} += "nettle nettle(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit)"

inherit rpm
