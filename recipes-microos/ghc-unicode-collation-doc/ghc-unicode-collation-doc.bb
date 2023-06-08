SUMMARY = "Haskell unicode-collation library documentation"
DESCRIPTION = "This package provides the Haskell unicode-collation library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-doc-0.1.3.4-1.3.noarch.rpm"
RPM_HASH = "25ccd88a25b12c59718e8a5e5dd834dec0dcd1a7640d0e4634f9a0d63e2ab7cd88a434cf6bf6abfb4a2beaa8d27ab8f80b2c4e19a88f2a57b8b3b5eb513f8f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-collation-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
