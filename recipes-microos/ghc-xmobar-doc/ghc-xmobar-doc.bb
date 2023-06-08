SUMMARY = "Haskell xmobar library documentation"
DESCRIPTION = "This package provides the Haskell xmobar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-doc-0.46-2.4.noarch.rpm"
RPM_HASH = "be82b61b40d1b0f574c27e32a02e526494f827a6be161f9059a7e81a2c5a3feb4a0115222140fdb1b86d59b916f57f4034e34fed273b5f9a18733a1412692113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmobar-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
