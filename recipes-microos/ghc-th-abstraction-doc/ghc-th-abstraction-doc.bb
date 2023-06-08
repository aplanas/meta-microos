SUMMARY = "Haskell th-abstraction library documentation"
DESCRIPTION = "This package provides the Haskell th-abstraction library documentation."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-doc-0.4.5.0-2.3.noarch.rpm"
RPM_HASH = "808ec2d040f249bd9bf7224ad00feff6d764c61d8e6d59023424bd0c6bdd0dfba1343c5abe42af9003f92030e33c4bec15ebb702e0f62ae0a2739966d28db2e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-abstraction-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
