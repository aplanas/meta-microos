SUMMARY = "Documentation for texlive-srcltx"
DESCRIPTION = "This package includes the documentation for texlive-srcltx"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.6svn15878"

RPM_NAME = "texlive-srcltx-doc-2023.201.1.6svn15878-57.1.noarch.rpm"
RPM_HASH = "699e2819be83249d22cdc801916a633e6c84641610218ccb9a461e3262ad6161d0d02289cb98a069e1242cb2d9b87a61802fed81486bbef37552f57262c0870a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srcltx-doc"
RDEPENDS:${PN} += ""

inherit rpm
