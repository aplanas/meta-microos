SUMMARY = "Typeset circled numbers"
DESCRIPTION = "This package generates circled numbers (or other kinds of \
markers or small text) to mark 'steps' in procedures, \
exercises, and so on."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn63255"

RPM_NAME = "texlive-circledsteps-2023.201.1.3.1svn63255-53.1.noarch.rpm"
RPM_HASH = "aafa6513710e61e89f8bef8815632709ebf226ac720a5d6c0b174ceed11059d4ae019a03b79044723337744f7ac5513a6b00a2c17cd4a6e45cb2e6c2515c68e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(circledsteps.sty) texlive-circledsteps"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(pgfkeys.sty) tex(pict2e.sty) tex(picture.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
