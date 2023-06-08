SUMMARY = "Haskell word-wrap library documentation"
DESCRIPTION = "This package provides the Haskell word-wrap library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-doc-0.5-2.2.noarch.rpm"
RPM_HASH = "e590b89adb733ac758edeedac48f10f6bf64146b3132f2fcb41c35301533a525a8aa3e9e29c32c691064b7e5a9ef8d426fce29338878322c40ea67ac8799162d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-word-wrap-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
