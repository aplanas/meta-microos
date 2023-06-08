SUMMARY = "Haskell unordered-containers profiling library"
DESCRIPTION = "This package provides the Haskell unordered-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-prof-0.2.19.1-3.3.aarch64.rpm"
RPM_HASH = "40f584a950e2a6660e547b27357c73f5efa0d7af2d3ffdca097e1fbe343910ff72bf0aeddaad134409450efba4a247e10b184532affab13bfe5b256aedaa27fc"

RPROVIDES:${PN} += "ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-unordered-containers-prof ghc-unordered-containers-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-prof(template-haskell-2.19.0.0) ghc-unordered-containers-devel"

inherit rpm
