SUMMARY = "Haskell text-conversions library documentation"
DESCRIPTION = "This package provides the Haskell text-conversions library documentation."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-doc-0.3.1.1-2.2.noarch.rpm"
RPM_HASH = "2178909b80a6ab3389858122b2ee2e56060928e33eb1eee3eebf0c323bbc02d7929565fe04d427d9e48ba631da905400b3cf39bcc260a31b5d3d8c56bb3ec68e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-conversions-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
