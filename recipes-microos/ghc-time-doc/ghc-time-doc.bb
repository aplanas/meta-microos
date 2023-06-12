SUMMARY = "Haskell time library documentation"
DESCRIPTION = "This package provides the Haskell time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-doc-1.12.2-3.1.noarch.rpm"
RPM_HASH = "3a06e2905a1de8e7314124414bf5d1f14c084c55536af2f7e09a5b23db993221c2e08e92d2d23a68c1cde4fbf1ba788430b3d433d35cddc31d0a8f5e66c846cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
