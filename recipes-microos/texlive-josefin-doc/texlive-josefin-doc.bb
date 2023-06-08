SUMMARY = "Documentation for texlive-josefin"
DESCRIPTION = "This package includes the documentation for texlive-josefin"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64569"

RPM_NAME = "texlive-josefin-doc-2023.201.svn64569-55.1.noarch.rpm"
RPM_HASH = "d0d0fbbebe86b3e3df88da8b7367c87b370bd842fb5a61145096b0d6e35ca3ae3e475793fe21afacacf74f188b0e285fdc2cb1be046f99a9144b59293e995c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-josefin-doc"
RDEPENDS:${PN} += ""

inherit rpm
