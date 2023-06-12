SUMMARY = "Haskell word8 profiling library"
DESCRIPTION = "This package provides the Haskell word8 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-prof-0.1.3-5.3.aarch64.rpm"
RPM_HASH = "ebd51d6c25b8569d358cb84eb1e2c7d2151c5cbd1d2cc20830cd7db61743533805fead6300b3a9d649b5fc8db35fcc85abca1a9b14ab239dc2680398ea985e91"

RPROVIDES:${PN} += "ghc-prof(word8-0.1.3-9uGjviso2af8K0EP8UmxRD) \
ghc-word8-prof \
ghc-word8-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-word8-devel"

inherit rpm
