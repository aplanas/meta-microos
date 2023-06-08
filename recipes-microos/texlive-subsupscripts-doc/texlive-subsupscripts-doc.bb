SUMMARY = "Documentation for texlive-subsupscripts"
DESCRIPTION = "This package includes the documentation for texlive-subsupscripts"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16080"

RPM_NAME = "texlive-subsupscripts-doc-2023.201.1.0svn16080-57.1.noarch.rpm"
RPM_HASH = "f241943d749198d035697868da72392d34df9a7c91072591fa35260ffc31e631213b2680e37af7643724fac7ec17d13538c065a8d384ecbf5b6db6ee83f0b9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subsupscripts-doc"
RDEPENDS:${PN} += ""

inherit rpm
