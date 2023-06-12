SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9"

RPM_NAME = "libnettle-devel-3.9-1.1.aarch64.rpm"
RPM_HASH = "302a7ca8cf066fc13b2afc36cc8a560e4da63eb4e612b727b3e066dba2d95d06417650af451eb9ec55d1cbb00f8b5c03562b909705766c22868fa0ee961ef83c"

RPROVIDES:${PN} += "libnettle-devel libnettle-devel(aarch-64) pkgconfig(hogweed) pkgconfig(nettle)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel gmp-devel libhogweed6 libnettle8 pkgconfig(nettle)"

inherit rpm
