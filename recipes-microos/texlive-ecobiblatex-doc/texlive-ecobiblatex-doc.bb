SUMMARY = "Documentation for texlive-ecobiblatex"
DESCRIPTION = "This package includes the documentation for texlive-ecobiblatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-doc-2023.201.1.0svn39233-53.1.noarch.rpm"
RPM_HASH = "925431bce7fd64893664b4a3159b7b11dc1935e88bb32b06c43d8f6b4adb7e2ac30bd1e7d92b4a09b935eba0731883180ec6faab208efe1cde01fce7788ab70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecobiblatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
