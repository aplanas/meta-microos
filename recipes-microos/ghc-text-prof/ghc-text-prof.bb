SUMMARY = "Haskell text profiling library"
DESCRIPTION = "This package provides the Haskell text profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-prof-2.0.2-3.1.aarch64.rpm"
RPM_HASH = "eace2d3deb3c59a0699900b71c77808fc3fddf66d1da5f8719ea246b581cde99a086fe5a0d9d71efdc5ce3ddfc32fd0f1b168d611e43453e280050820dd14c4f"

RPROVIDES:${PN} += "ghc-prof(text-2.0.2) ghc-text-prof ghc-text-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(template-haskell-2.19.0.0) ghc-text-devel(aarch-64)"

inherit rpm
