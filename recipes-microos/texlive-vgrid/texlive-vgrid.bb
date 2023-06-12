SUMMARY = "Overlay a grid on the printed page"
DESCRIPTION = "The package overlays a grid (whose spacing is \\baselineskip, \
which offers guidlines for considering the 'rhythm' of the \
document on the page."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn32457"

RPM_NAME = "texlive-vgrid-2023.201.0.0.1svn32457-53.1.noarch.rpm"
RPM_HASH = "9427fa80afe5df725fa741cc433c143d5f8a73b3594c9ea064f591612a161ce1ffb5941b3167638e4a53cb27954eee35975829d1fc90a394030807cc1834ee91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(vgrid.sty) \
texlive-vgrid"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everypage.sty) \
tex(ifoddpage.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
