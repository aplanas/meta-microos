SUMMARY = "Haskell text library documentation"
DESCRIPTION = "This package provides the Haskell text library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-doc-2.0.2-1.1.noarch.rpm"
RPM_HASH = "7390a3bf3dc1a9436272e4ad0eae3b0294308c2ec837c6ae2d0c4b0e9d398c2c64b6cc8c956d62fe79720416352f357d1719b6c0448290fda83f3b253560cf7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
