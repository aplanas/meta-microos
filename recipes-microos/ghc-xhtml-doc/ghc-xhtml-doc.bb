SUMMARY = "Haskell xhtml library documentation"
DESCRIPTION = "This package provides the Haskell xhtml library documentation."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-doc-3000.2.2.1-1.1.noarch.rpm"
RPM_HASH = "9349aee1af0d84a5781263acb9ff247a2da7a91443bc7bd6ec3205c9e176116d007b75a72e3d90e2ab505021bc16b522a35517fa8794ccfe21d95db90d775f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xhtml-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
