SUMMARY = "Documentation for texlive-keyval2e"
DESCRIPTION = "This package includes the documentation for texlive-keyval2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn23698"

RPM_NAME = "texlive-keyval2e-doc-2023.201.0.0.0.2svn23698-55.1.noarch.rpm"
RPM_HASH = "58e926851ac565ddc6efc0cedb4cecd26aef3710887c0def246e637315a82d657f166a0f9f2ab281ce0b5ab2b823e6c52028a32556f091c0ef8148180d48bcb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyval2e-doc"
RDEPENDS:${PN} += ""

inherit rpm
