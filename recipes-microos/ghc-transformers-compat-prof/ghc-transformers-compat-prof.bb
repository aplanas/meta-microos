SUMMARY = "Haskell transformers-compat profiling library"
DESCRIPTION = "This package provides the Haskell transformers-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-prof-0.7.2-2.3.aarch64.rpm"
RPM_HASH = "f2b50ddd9861101d7ac948104a2136dd8ac88be88aaef8c8f3e04474207e92cc8491b65287dd64b38b858117346f67d20d7298ee92192e9562456176c5b2ec86"

RPROVIDES:${PN} += "ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) ghc-transformers-compat-prof ghc-transformers-compat-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(transformers-0.5.6.2) ghc-transformers-compat-devel"

inherit rpm
