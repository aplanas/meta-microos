SUMMARY = "Haskell texmath library documentation"
DESCRIPTION = "This package provides the Haskell texmath library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7.1"

RPM_NAME = "ghc-texmath-doc-0.12.7.1-1.3.noarch.rpm"
RPM_HASH = "87d55f770e30a08712fa3ca6a7030e19edd65e008e8b929667a0eacb9dfa4ca784e90205011aee61ee46198884cfbbe26313acb155d3383007303a2c715a4c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-texmath-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
