SUMMARY = "Haskell time profiling library"
DESCRIPTION = "This package provides the Haskell time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-prof-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "9533caefe49b63987306aac094d85152cd4c1a12064dd33ac965f18469e76c489d7deb6e155d064c19b834cb664e8a0e05ac0be6ddf948c421eff52bb580e22e"

RPROVIDES:${PN} += "ghc-prof(time-1.12.2) ghc-time-prof ghc-time-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-time-devel(aarch-64)"

inherit rpm
