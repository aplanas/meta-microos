SUMMARY = "Haskell word-wrap profiling library"
DESCRIPTION = "This package provides the Haskell word-wrap profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-prof-0.5-2.2.aarch64.rpm"
RPM_HASH = "b4b854c6b6e916eef34cfbcc13a312cdec61fa89c7ddb979e064bbbd89b9ce229097775355b359149e54cae180bd6cc848938140c045b81d3d4ec5c2c713d6c2"

RPROVIDES:${PN} += "ghc-prof(word-wrap-0.5-8lP0dTi9CAzDFiJFYJ3rcZ) ghc-word-wrap-prof ghc-word-wrap-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(text-2.0.2) ghc-word-wrap-devel"

inherit rpm
