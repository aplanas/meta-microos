SUMMARY = "Documentation for texlive-newcomputermodern"
DESCRIPTION = "This package includes the documentation for texlive-newcomputermodern"
LICENSE = "LPPL-1.3c"

PV = "2023.201.4.4svn66327"

RPM_NAME = "texlive-newcomputermodern-doc-2023.201.4.4svn66327-54.1.noarch.rpm"
RPM_HASH = "442df4f89237cf0e5578640dc36453b16fd25ed32e560c815d44e907b2f65a47a3657a6e515f6755bdd68e89271bd10fcafa21032480a633870539acfd122cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcomputermodern-doc"
RDEPENDS:${PN} += ""

inherit rpm
