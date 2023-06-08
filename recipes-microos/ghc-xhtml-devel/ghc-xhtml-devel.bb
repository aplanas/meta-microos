SUMMARY = "Haskell xhtml library development files"
DESCRIPTION = "This package provides the Haskell xhtml library development files."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-devel-3000.2.2.1-1.1.aarch64.rpm"
RPM_HASH = "77459dd8e530b93536a6d4e8fb3df38f5945f105937250e784a49245ac7e357c9e46137aa105b8a6c33abe8a2db14e565a82f48c9a7d0ad2e50b58f3045a7362"

RPROVIDES:${PN} += "ghc-devel(xhtml-3000.2.2.1) ghc-xhtml-devel ghc-xhtml-devel(aarch-64) ghc-xhtml-static ghc-xhtml-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-xhtml(aarch-64)"

inherit rpm
