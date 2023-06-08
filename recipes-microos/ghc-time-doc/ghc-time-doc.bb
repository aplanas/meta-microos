SUMMARY = "Haskell time library documentation"
DESCRIPTION = "This package provides the Haskell time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-doc-1.12.2-1.1.noarch.rpm"
RPM_HASH = "0e39afabda29b0666c0636dc6eb26265f06ab47f0d8948df775e3a6f4cbf30e839d6a0a426af68f8f9c64cd666660963a02734542300c22b14711bc50998ad30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
