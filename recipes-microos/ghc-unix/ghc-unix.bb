SUMMARY = "Haskell unix library"
DESCRIPTION = "This package provides the Haskell unix library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "ef335047a8b47c2be25b1b912d5857256962b5b29a108184c239f0f726e5c69c8608c2543981aa1c64a4f5618a962293033fb0d5a1156ee89efef8e993795bf9"

RPROVIDES:${PN} += "ghc-unix ghc-unix(aarch-64) libHSunix-2.7.3-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
