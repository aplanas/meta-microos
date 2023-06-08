SUMMARY = "Haskell x509 library documentation"
DESCRIPTION = "This package provides the Haskell x509 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-doc-1.7.7-2.3.noarch.rpm"
RPM_HASH = "90c54494e1cfc6232533deee5fc26c614d14733a17ab429bb881c20416068950000920f6c5a84593cb5a6cd5c62f1e28bba38921ce0af72e4943e5bc1c5502c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
