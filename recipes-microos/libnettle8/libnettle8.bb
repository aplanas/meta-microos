SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libnettle8-3.8.1-2.3.aarch64.rpm"
RPM_HASH = "598081af490774c28be5f7604ef19fb1242138d3fdf79f706da6ff30d2fbb758e5406b00cd32e213bdea953fdde3b965bcd1e67835aa46077cff0e81d48dfc6d"

RPROVIDES:${PN} += "libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libnettle.so.8(NETTLE_INTERNAL_8_6)(64bit) libnettle8 libnettle8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
