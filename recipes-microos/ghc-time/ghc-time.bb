SUMMARY = "Haskell time library"
DESCRIPTION = "This package provides the Haskell time library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "7f79d911e73b5b5551413def0466f7a403b6a8b068421c9d5b8c034fbaf1afafe4620a87e3665ee4d0bc2659bc9129eadfae54b7c749742bca133461aa8aa523"

RPROVIDES:${PN} += "ghc-time ghc-time(aarch-64) libHStime-1.12.2-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
