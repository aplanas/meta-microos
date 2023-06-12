SUMMARY = "Haskell text library development files"
DESCRIPTION = "This package provides the Haskell text library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-devel-2.0.2-3.1.aarch64.rpm"
RPM_HASH = "729463db1156d73e8b081fb74e7ebac414b88e80325351cc219e483d63469e629142060b465ddbaab71533a4288ab6338fca4da30bea29d069b6154b68bcf219"

RPROVIDES:${PN} += "ghc-devel(text-2.0.2) \
ghc-text-devel \
ghc-text-devel(aarch-64) \
ghc-text-static \
ghc-text-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-text(aarch-64)"

inherit rpm
