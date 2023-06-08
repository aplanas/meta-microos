SUMMARY = "Binary files of latexfileversion"
DESCRIPTION = "Binary files of latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25012"

RPM_NAME = "texlive-latexfileversion-bin-2023.20230311.svn25012-89.1.aarch64.rpm"
RPM_HASH = "c9dba982a870d8c17344d800eefc779b714facd17484c4083405d97856645d16c824a2aebaeb29fdf601c3771fe498f7230d61a378ead273b195bcebecf655a0"

RPROVIDES:${PN} += "texlive-latexfileversion-bin texlive-latexfileversion-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexfileversion"

inherit rpm
