SUMMARY = "Haskell xhtml library"
DESCRIPTION = "This package provides the Haskell xhtml library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-3000.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "a66c924e94d79d4d6377599c42799eb165b3087d863b90703f4e34e9202c4e7c3e5fdacc2dca1eecf5e41f0c1c966a85931fb5a4621a5beb08333dfba8994ed1"

RPROVIDES:${PN} += "ghc-xhtml ghc-xhtml(aarch-64) libHSxhtml-3000.2.2.1-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
