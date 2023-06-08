SUMMARY = "Haskell uuid library documentation"
DESCRIPTION = "This package provides the Haskell uuid library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-doc-1.3.15-4.3.noarch.rpm"
RPM_HASH = "0d1fbfcd2ab68c73fd55e3f64bd81b26917361f8e6d5e10d1eb289112182a7f5011ebc11198556aed16fea3ac7bf26a86ad738934cac0a973b89ea9750f47e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uuid-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
