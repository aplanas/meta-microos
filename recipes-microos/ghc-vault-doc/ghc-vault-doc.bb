SUMMARY = "Haskell vault library documentation"
DESCRIPTION = "This package provides the Haskell vault library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-doc-0.3.1.5-4.3.noarch.rpm"
RPM_HASH = "d081d79744767fbe7820b70530c75b81aff996c5016a88cf095afe6d7c3d5ebcd635e640826acce381d5fde80534b1df0263854703a1de4ff9b0874779399e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vault-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
