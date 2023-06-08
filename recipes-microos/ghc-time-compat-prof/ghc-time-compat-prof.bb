SUMMARY = "Haskell time-compat profiling library"
DESCRIPTION = "This package provides the Haskell time-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-prof-1.9.6.1-5.3.aarch64.rpm"
RPM_HASH = "1a2ac2cd3719768a72fb81c0c9cf1c5f74909e91ab11fedb83c94690f7a9feebc1f446705ab54d47b6c84fcad9f51db86e705ddc3b26221361f7cd4686b06058"

RPROVIDES:${PN} += "ghc-prof(time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82) ghc-time-compat-prof ghc-time-compat-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) ghc-prof(deepseq-1.4.8.0) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-prof(time-1.12.2) ghc-time-compat-devel"

inherit rpm
