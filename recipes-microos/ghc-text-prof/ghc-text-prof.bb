SUMMARY = "Haskell text profiling library"
DESCRIPTION = "This package provides the Haskell text profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-prof-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "809e3ed07bec2240291050b4155f51b24a8dd29f4f7a294cf88fce17b5b5b1cd167397e8669263ef6dfe2bc4b560082ac641e1b1483b0796736f91362572e0c4"

RPROVIDES:${PN} += "ghc-prof(text-2.0.2) ghc-text-prof ghc-text-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(template-haskell-2.19.0.0) ghc-text-devel(aarch-64)"

inherit rpm
