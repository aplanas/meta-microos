SUMMARY = "Documentation for texlive-footmisx"
DESCRIPTION = "This package includes the documentation for texlive-footmisx"
LICENSE = "LPPL-1.0"

PV = "2023.201.20161201svn42621"

RPM_NAME = "texlive-footmisx-doc-2023.201.20161201svn42621-52.1.noarch.rpm"
RPM_HASH = "41c1800bdc619c15ab8de04f206dfa0e9bfb5e592159d0a886dfce66960cc1f8b8f45ae73d970dac393524d1d9b520e53d7f4b1626914c55d08ff10aeca6cd80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footmisx-doc"
RDEPENDS:${PN} += ""

inherit rpm
