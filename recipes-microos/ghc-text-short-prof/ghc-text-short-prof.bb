SUMMARY = "Haskell text-short profiling library"
DESCRIPTION = "This package provides the Haskell text-short profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-prof-0.1.5-3.3.aarch64.rpm"
RPM_HASH = "ccd7c3298f0980acfe65fe881a2838d1801293ae92c51a46eb96cbefcdffc3a0410205989a9f4347a75f57bdfa7b24b41aecb8bb23608b7ad5b4bb949f3eb5d6"

RPROVIDES:${PN} += "ghc-prof(text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2) ghc-text-short-prof ghc-text-short-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-prof(template-haskell-2.19.0.0) ghc-prof(text-2.0.2) ghc-text-short-devel"

inherit rpm
