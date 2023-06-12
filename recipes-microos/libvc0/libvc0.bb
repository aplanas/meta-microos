SUMMARY = "Library to read and write vcard files"
DESCRIPTION = "Library to read and write vcard files."
LICENSE = "LGPL-2.1-only"

PV = "012"

RPM_NAME = "libvc0-012-1.3.aarch64.rpm"
RPM_HASH = "c6e29633de7e3f309d85375c4f0a5c312d72c1cadb5ac4adcaa016959fb384860cf5cf0d4add64e59277aad78bdb1406ff73538b1e09eb1441f1f27d6fe5cbb1"

RPROVIDES:${PN} += "libvc.so.0()(64bit) \
libvc0 \
libvc0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
