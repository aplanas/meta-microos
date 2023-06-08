SUMMARY = "Haskell transformers profiling library"
DESCRIPTION = "This package provides the Haskell transformers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-prof-0.5.6.2-1.1.aarch64.rpm"
RPM_HASH = "4ef728b019432fc5fe9b6e4230fd4ba215a4da11fd90a8c4e3b3abc53af5b70a62aef86e3e4533d36656b843b7514339fdb419deb161e80c28d147594483f073"

RPROVIDES:${PN} += "ghc-prof(transformers-0.5.6.2) ghc-transformers-prof ghc-transformers-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-transformers-devel(aarch-64)"

inherit rpm
