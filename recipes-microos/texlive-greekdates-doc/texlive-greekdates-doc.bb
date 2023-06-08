SUMMARY = "Documentation for texlive-greekdates"
DESCRIPTION = "This package includes the documentation for texlive-greekdates"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-greekdates-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "747082a90839fff1ff3499663bdd3e2e8f9e60e9c0b12d028d9f4fbcde433e9c504920db1c44c049e0d54b78521bf3ad86f2ec09134d01c1c6c0bbc6c263a319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greekdates-doc"
RDEPENDS:${PN} += ""

inherit rpm
