SUMMARY = "Haskell uuid-types profiling library"
DESCRIPTION = "This package provides the Haskell uuid-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-prof-1.0.5-5.2.aarch64.rpm"
RPM_HASH = "f68f08cfc28bd1e2c9de39451f82934e25d7863b60846db3efc50ed12b58583e3794c9f17b3809fdd6c73198b5efc329129d24d18fefb949263d228d73b381c8"

RPROVIDES:${PN} += "ghc-prof(uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM) ghc-uuid-types-prof ghc-uuid-types-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-prof(template-haskell-2.19.0.0) ghc-prof(text-2.0.2) ghc-uuid-types-devel"

inherit rpm
