SUMMARY = "Printing ornaments"
DESCRIPTION = "The package uses PSTricks to draw ornaments (a substantial \
repertoire of ornaments is provided)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-2023.201.0.0.41svn60488-53.1.noarch.rpm"
RPM_HASH = "daf308a1bbb7b1c059da6f225a50f07c144bd6a05abf2a1661d1efd701c5e541c0e0362a3e8830d24a92bdcaa3bea4be1f46e4cde35c0239859ff7620cf15ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(psvectorian.sty) texlive-pst-vectorian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphicx.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
