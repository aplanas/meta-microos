SUMMARY = "Haskell text library development files"
DESCRIPTION = "This package provides the Haskell text library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-devel-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "226a8e94cb5fa16426cc5a00ea2a75ecb4c2afd0c90b51d4a890160086e2bcc09174a07d0be85e2bb7407e8b86a1137a647b68c68cfb23ba0ba6657eb2861c4a"

RPROVIDES:${PN} += "ghc-devel(text-2.0.2) ghc-text-devel ghc-text-devel(aarch-64) ghc-text-static ghc-text-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(ghc-prim-0.9.0) ghc-devel(template-haskell-2.19.0.0) ghc-text(aarch-64)"

inherit rpm
