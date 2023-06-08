SUMMARY = "Haskell transformers library documentation"
DESCRIPTION = "This package provides the Haskell transformers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-doc-0.5.6.2-1.1.noarch.rpm"
RPM_HASH = "bc2cd1d801489478f178f3ccf6be06e01b9ce54cc42a377c3eb9e7b54eb25758d9ba3da86d52b6ddb473ed8059822557f9f33245e8e6de208053d69b2467b867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
