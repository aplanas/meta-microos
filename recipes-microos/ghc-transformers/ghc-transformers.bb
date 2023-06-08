SUMMARY = "Haskell transformers library"
DESCRIPTION = "This package provides the Haskell transformers library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-0.5.6.2-1.1.aarch64.rpm"
RPM_HASH = "420445a23ec9e3465e0fad4921091d18122152073982436d4a81ebdb0964c90338bba5825435970ebea2b8892d2182f448497df19f9bc4921bd3b97dd23422ff"

RPROVIDES:${PN} += "ghc-transformers ghc-transformers(aarch-64) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
