SUMMARY = "Documentation for texlive-tikzinclude"
DESCRIPTION = "This package includes the documentation for texlive-tikzinclude"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn28715"

RPM_NAME = "texlive-tikzinclude-doc-2023.201.1.0svn28715-52.1.noarch.rpm"
RPM_HASH = "10f85c71906a5e5ac7200783d9ec597712341b8f7d6dfa4f65e8fcd72115a8085b16397b8b47a4ca835ca472b15e42ae5f754dfbe019bd7ec65a46c40f729635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzinclude-doc"
RDEPENDS:${PN} += ""

inherit rpm
