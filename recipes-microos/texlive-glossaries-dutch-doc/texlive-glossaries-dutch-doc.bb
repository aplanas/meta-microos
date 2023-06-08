SUMMARY = "Documentation for texlive-glossaries-dutch"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-doc-2023.201.1.1svn35685-53.1.noarch.rpm"
RPM_HASH = "af2d7fd899c1be089bb5e091d26f3675215f091e7d5a2c766fb36f8c01bb326ff518382688681d688145b34f1bd583006de4a09c46f0c1e659f196df7ef632e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-dutch-doc"
RDEPENDS:${PN} += ""

inherit rpm
