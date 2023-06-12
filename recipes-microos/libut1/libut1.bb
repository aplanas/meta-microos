SUMMARY = "Library for assisting in URI construction from templates"
DESCRIPTION = "This package provides the shared library libut from opendkim which \
assists in URI construction from templates."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "libut1-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "94b66139b4c82567644b88afc3500d740a800cce477ae9e7d5319e0e32f7753cf0ae5d5a9a35aa0fa43afbe48cc330f396f0d8fa5aa1e99e79602b7fe970d167"

RPROVIDES:${PN} += "config(libut1) \
libut.so.1()(64bit) \
libut1 \
libut1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
