SUMMARY = "Haskell transformers profiling library"
DESCRIPTION = "This package provides the Haskell transformers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-prof-0.5.6.2-3.1.aarch64.rpm"
RPM_HASH = "be3bf4846f4697bbe7947d59fd74a6e3fb3f5926871b13fff0d7eb63ea050d7838a540f00cac811482faf526ae79a4a099facd8514473bb63c0f8e887ebd2c3a"

RPROVIDES:${PN} += "ghc-prof(transformers-0.5.6.2) \
ghc-transformers-prof \
ghc-transformers-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-transformers-devel(aarch-64)"

inherit rpm
