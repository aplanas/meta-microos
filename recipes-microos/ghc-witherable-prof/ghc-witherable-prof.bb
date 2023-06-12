SUMMARY = "Haskell witherable profiling library"
DESCRIPTION = "This package provides the Haskell witherable profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-prof-0.4.2-4.2.aarch64.rpm"
RPM_HASH = "bfa99765220e07583d16e850af0c6fd10e34c9f405d0bc07eb1244aac9558c21f85e68c9003c94fecfc5c2786c8a6d12a9763f6dc8fe13fab7240b63c1ed1d59"

RPROVIDES:${PN} += "ghc-prof(witherable-0.4.2-3r5H0uqg5SQLafbMfCHwUh) \
ghc-witherable-prof \
ghc-witherable-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) \
ghc-prof(containers-0.6.7) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) \
ghc-prof(indexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-witherable-devel"

inherit rpm
