SUMMARY = "Haskell xhtml library"
DESCRIPTION = "This package provides the Haskell xhtml library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-3000.2.2.1-1.1.aarch64.rpm"
RPM_HASH = "b8d354ad4b84245908c98d4ac426042b86bf378f89a172b5833ce2bbc1a5a8c8da02e3d42e6624f9591f4e3cb5129dc0f0ecd806ae7cc87e16d2829778e2ff56"

RPROVIDES:${PN} += "ghc-xhtml ghc-xhtml(aarch-64) libHSxhtml-3000.2.2.1-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
