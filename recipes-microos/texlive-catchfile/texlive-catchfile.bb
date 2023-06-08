SUMMARY = "Catch an external file into a macro"
DESCRIPTION = "This package catches the contents of a file and puts it in a \
macro. It requires e-TeX. Both LaTeX and plain TeX are \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn53084"

RPM_NAME = "texlive-catchfile-2023.201.1.8svn53084-52.1.noarch.rpm"
RPM_HASH = "88fd5d63ef97db41d11701b41794234e2d978a21b2c5ccea66a25531780752229776ebf44e215656e3b4653260d9667190efd4b577d81cd78040bcc39002b54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(catchfile.sty) texlive-catchfile"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etexcmds.sty) tex(infwarerr.sty) tex(ltxcmds.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
