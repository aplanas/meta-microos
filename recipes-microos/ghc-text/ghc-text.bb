SUMMARY = "Haskell text library"
DESCRIPTION = "This package provides the Haskell text library."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "94e86a94e1d56eb6976907ccfc919979d5d5bf0c16ae76b5533487fd751f0b36d8edaaf5ad9f68611a881e9f386db5d75545aaed6eacd59e0f863c65fe90dea0"

RPROVIDES:${PN} += "ghc-text ghc-text(aarch-64) libHStext-2.0.2-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
