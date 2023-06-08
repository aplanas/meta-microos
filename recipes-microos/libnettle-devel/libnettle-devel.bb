SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libnettle-devel-3.8.1-2.3.aarch64.rpm"
RPM_HASH = "f75ea986512ac3f656cf3bd800e358341a1ac0a1d3dad595c8a5970511266005bbbfbe9acc6cfa4a7b21edbcf69efcfd5e9594e67a9c79a3fddd7b66cc3d35ce"

RPROVIDES:${PN} += "libnettle-devel libnettle-devel(aarch-64) pkgconfig(hogweed) pkgconfig(nettle)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel gmp-devel libhogweed6 libnettle8 pkgconfig(nettle)"

inherit rpm
