SUMMARY = "Documentation for texlive-namedef"
DESCRIPTION = "This package includes the documentation for texlive-namedef"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55881"

RPM_NAME = "texlive-namedef-doc-2023.201.1.0svn55881-54.1.noarch.rpm"
RPM_HASH = "9ebb5396e82a6c546629d4ebc068197a948cfbbdbb935124e869139dafaa411c18d1b3b48466a07632ec3a5c9d8c398eb724eaa0f3d144a76e3fd09a1d6b074a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namedef-doc"
RDEPENDS:${PN} += ""

inherit rpm
