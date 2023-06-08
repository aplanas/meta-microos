SUMMARY = "Documentation for texlive-comicneue"
DESCRIPTION = "This package includes the documentation for texlive-comicneue"
LICENSE = "OFL-1.1"

PV = "2023.201.1.2svn54891"

RPM_NAME = "texlive-comicneue-doc-2023.201.1.2svn54891-53.1.noarch.rpm"
RPM_HASH = "69e90f0bbcffe6ee4aa3b8d7f0e5fc0436c58f4083b812db4057a63f48b49eacbb932b5d25b2e3b820b02fd91ba9c86e875d0caa48522ab88fa488ef289ae261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comicneue-doc"
RDEPENDS:${PN} += ""

inherit rpm
