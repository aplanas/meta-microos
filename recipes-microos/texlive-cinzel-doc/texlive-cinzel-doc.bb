SUMMARY = "Documentation for texlive-cinzel"
DESCRIPTION = "This package includes the documentation for texlive-cinzel"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64550"

RPM_NAME = "texlive-cinzel-doc-2023.201.svn64550-53.1.noarch.rpm"
RPM_HASH = "eadcfe5f12c256f056368dc9874a3e6d84b5d7fc846e8341593be27ad70d489aaf2050209d78823faa55c7e28f910f58106aa2f1e1184762ddbe47250522fd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cinzel-doc"
RDEPENDS:${PN} += ""

inherit rpm
