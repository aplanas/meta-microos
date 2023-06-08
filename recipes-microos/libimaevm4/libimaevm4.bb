SUMMARY = "IMA/EVM control utility libary"
DESCRIPTION = "This package provides the shared library for IMA/EVM (Integrity \
Measurement Architecture/Extended Verification Module)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "libimaevm4-1.5-1.2.aarch64.rpm"
RPM_HASH = "332eea56e00ec4025e875858c0d14d82d0b74bbf0cf8f592a1ad3d577ac8e215f7db5058abbe6955619f1675087decbd02d24a6428c6573c4d0e9e99bb962893"

RPROVIDES:${PN} += "libimaevm.so.4()(64bit) libimaevm4 libimaevm4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
