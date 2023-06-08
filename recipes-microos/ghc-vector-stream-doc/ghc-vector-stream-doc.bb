SUMMARY = "Haskell vector-stream library documentation"
DESCRIPTION = "This package provides the Haskell vector-stream library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-doc-0.1.0.0-2.2.noarch.rpm"
RPM_HASH = "8bf0518430e57e360b24f10462998dc9230241a54960875439361fd9b02767aefdc983959071a1d5f779546398054a72197ee6851d6fe2fac987f975ccdf9905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-stream-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
