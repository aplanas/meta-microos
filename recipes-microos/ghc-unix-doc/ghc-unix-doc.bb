SUMMARY = "Haskell unix library documentation"
DESCRIPTION = "This package provides the Haskell unix library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-doc-2.7.3-1.1.noarch.rpm"
RPM_HASH = "3f55aa6abca423b1492e461691f818c688cf1f3d9280d716aac555b71ae7de49a5a347d2ed0783e1f244f1e7fc353b5cc97461b56d27cebecef1c009d5eede37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
