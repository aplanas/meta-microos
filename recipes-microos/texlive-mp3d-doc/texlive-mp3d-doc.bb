SUMMARY = "Documentation for texlive-mp3d"
DESCRIPTION = "This package includes the documentation for texlive-mp3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn29349"

RPM_NAME = "texlive-mp3d-doc-2023.201.1.34svn29349-54.1.noarch.rpm"
RPM_HASH = "30e2cb37420ef2c8dd1535243bf240197fd45de117bfcd140d569dee0ef8b489a69b2fd90da4e9e8cbddbb0e8c0a2cbb01c082456a520657747f635d60444a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-mp3d-doc:fr;en) \
texlive-mp3d-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
