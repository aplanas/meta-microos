SUMMARY = "Documentation for texlive-lcg"
DESCRIPTION = "This package includes the documentation for texlive-lcg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn31474"

RPM_NAME = "texlive-lcg-doc-2023.201.1.3svn31474-54.1.noarch.rpm"
RPM_HASH = "520446dc14057137f7af57443a26d18590ef606c6ea2d9780ba23464ef24cbf7396d626c1780bf589af2c5bbf5980b5fb65f88d2ff9543ae94eb5a524a0c8322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcg-doc"
RDEPENDS:${PN} += ""

inherit rpm
