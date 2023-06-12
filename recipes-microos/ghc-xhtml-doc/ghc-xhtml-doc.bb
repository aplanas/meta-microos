SUMMARY = "Haskell xhtml library documentation"
DESCRIPTION = "This package provides the Haskell xhtml library documentation."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-doc-3000.2.2.1-3.1.noarch.rpm"
RPM_HASH = "d48df3c9bc32ff7f35a6a07f0b7a5a6aa2a41de51012ff69e0b03960299c79b031c764cbdbea79fe2ca8434020245f91dc950a46b0cb482adb45faed3aa5053b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xhtml-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
