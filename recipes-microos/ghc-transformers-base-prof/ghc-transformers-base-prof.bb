SUMMARY = "Haskell transformers-base profiling library"
DESCRIPTION = "This package provides the Haskell transformers-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-prof-0.4.6-2.2.aarch64.rpm"
RPM_HASH = "5a477ce547a113171f78f3541eeb650cd0257388b7071314abaf37f110137f30fc29e24482de6744fdaac28f812285c3a69291c542dfb8176a19452dbd351f73"

RPROVIDES:${PN} += "ghc-prof(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) ghc-transformers-base-prof ghc-transformers-base-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) ghc-prof(stm-2.5.1.0) ghc-prof(transformers-0.5.6.2) ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) ghc-transformers-base-devel"

inherit rpm
