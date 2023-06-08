SUMMARY = "Haskell wizards library documentation"
DESCRIPTION = "This package provides the Haskell wizards library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-doc-1.0.3-5.3.noarch.rpm"
RPM_HASH = "08aeb00bb5c29c071156bbfce20b921ac39adc7005121149780ff2a47b8296547e395affba543c9fe577f35a14718b133d8c1ec9d06dc9806ca70bb6054b3432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wizards-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
