SUMMARY = "Development package for LASH"
DESCRIPTION = "This package contains the library for the LASH system."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "liblash1-0.5.4-2.11.aarch64.rpm"
RPM_HASH = "a44f8bd543e38ae5a29673b33ab0f09b8a6d467e6256ee5fa03061cd1d6b70a92e9d3a5f390c58ddfafeb26af293326f7fa9d4c7dadf1a9151e22ce1565e0edc"

RPROVIDES:${PN} += "liblash.so.1()(64bit) \
liblash1 \
liblash1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
