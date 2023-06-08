SUMMARY = "Haskell unicode-collation profiling library"
DESCRIPTION = "This package provides the Haskell unicode-collation profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-prof-0.1.3.4-1.3.aarch64.rpm"
RPM_HASH = "baede9bba2b8d25033cc968105ecfc87b26bba7d6a3156e5e009d8fd6299a6d83bbdc659803a7c45d22ea1ca44ab7967a9e3014c55adeb88d27a608d8f4b09a2"

RPROVIDES:${PN} += "ghc-prof(unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP) ghc-unicode-collation-prof ghc-unicode-collation-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(parsec-3.1.16.1) ghc-prof(template-haskell-2.19.0.0) ghc-prof(text-2.0.2) ghc-prof(th-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx) ghc-unicode-collation-devel"

inherit rpm
