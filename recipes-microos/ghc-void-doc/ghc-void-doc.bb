SUMMARY = "Haskell void library documentation"
DESCRIPTION = "This package provides the Haskell void library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-doc-0.7.3-6.2.noarch.rpm"
RPM_HASH = "f96af760f6fbb7bc79820cb5a7eb9a4a3b248d90e03c127372d61a48c5a827eaa832de5b05f3eb64159522dcd78585bca27c3590a8e5faa1bf09ab8784fd8421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-void-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
