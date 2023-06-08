SUMMARY = "Generic handling of TeX category codes"
DESCRIPTION = "The bundle deals with category code switching; the packages of \
the bundle should work with any TeX format (with the support of \
the plainpkg package). The bundle provides stacklet.sty, which \
supports stacks that control the use of different catcodes; \
actcodes.sty, which deals with active characters; and \
catchdq.sty, which provides a simple quotation character \
control mechanism."
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.2svn38859"

RPM_NAME = "texlive-catcodes-2023.201.r0.2svn38859-52.1.noarch.rpm"
RPM_HASH = "2f20e19661d63a2a8ac6488190769d128d1ac91fd027eab77fe5a722402090f6f58c4e35ca2d316b27bf23538d8260e1d8bed37820d2a871c3d2e9132f1bf934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(actcodes.sty) tex(catchdq.sty) tex(stacklet.sty) texlive-catcodes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
