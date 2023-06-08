SUMMARY = "An open source cryptography library"
DESCRIPTION = "BeeCrypt is an ongoing project to provide a strong and fast \
cryptography toolkit. Includes entropy sources, random generators, \
block ciphers, hash functions, message authentication codes, \
multiprecision integer routines, and public key primitives."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.2"

RPM_NAME = "libbeecrypt6-4.1.2-28.12.aarch64.rpm"
RPM_HASH = "7c98a8c4799967d9e41afa845f833afb241d1d017c461bb9a7e824c33264419a43adae7105b1cd930b1b0b654e5fc4a4291061ec655bc3433bd5a5ef33dbdd65"

RPROVIDES:${PN} += "libbeecrypt.so.6()(64bit) libbeecrypt6 libbeecrypt6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
