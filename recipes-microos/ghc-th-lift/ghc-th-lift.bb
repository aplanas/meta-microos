SUMMARY = "Derive Template Haskell's Lift class for datatypes"
DESCRIPTION = "Derive Template Haskell's 'Lift' class for datatypes using 'TemplateHaskell'. \
The functionality in this package has largely been subsumed by the 'DeriveLift' \
language extension, which is available in GHC 8.0 and later versions. \
This package can still be useful as a uniform way to derive 'Lift' instances \
that is backwards-compatible with older GHCs. \
 \
The following libraries are related: \
 \
* The <https://hackage.haskell.org/package/th-orphans th-orphans> package \
provides instances for 'template-haskell' syntax types. \
 \
* The <http://hackage.haskell.org/package/th-lift-instances th-lift-instances> \
package provides 'Lift' instances for types in 'base', 'text', 'bytestring', \
'vector', etc. Some of these instances are only provided for old versions of \
their respective libraries, as the same 'Lift' instances are also present \
upstream on newer versions."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.3"

RPM_NAME = "ghc-th-lift-0.8.3-1.2.aarch64.rpm"
RPM_HASH = "11f3489e86d2e54211792fa18d32bc128aa4d14e59dc30b9451b0a97d5734a74660896ba61cd572bb3419e6fa83122298613f0dd23795af6a6333d66c6f99a8c"

RPROVIDES:${PN} += "ghc-th-lift ghc-th-lift(aarch-64) libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
