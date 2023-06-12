SUMMARY = "Static library for -static linking with libxcrypt"
DESCRIPTION = "This package contains the libxcrypt static libraries for -static \
linking.  You don't need this, unless you link statically, which \
is highly discouraged."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.34"

RPM_NAME = "libxcrypt-devel-static-4.4.34-1.1.aarch64.rpm"
RPM_HASH = "9626d0c4d5f9564912c7a60edba72c971380cf12c5e2966ddec7e3e7ce6057888626a7f24c6280c9e0d51c0d827cfa941c43ea1bcb3aa47f113e1cb1269ab40f"

RPROVIDES:${PN} += "glibc-devel-static:/usr/lib64/libcrypt.a \
libxcrypt-devel-static \
libxcrypt-devel-static(aarch-64)"
RDEPENDS:${PN} += "glibc-devel-static \
libxcrypt-devel"

inherit rpm
