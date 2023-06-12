SUMMARY = "Arrange text on a sheet to fold into a greeting card"
DESCRIPTION = "The package provides a simple means of producing greeting \
cards. It arranges four panels onto a single sheet so that when \
the sheet is folded twice the four panels are arranged as front \
cover, inside left and right pages, and back cover. It uses the \
textpos package for placement on the sheet and the graphicx \
package for the necessary rotation. The four panels are set in \
minipages for formatting by the user."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-gcard-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "e8dc7e221f8b185edc97414077f0e5615c77d46cd87924e87e9a8ad40935d69919b86d57cdac656b4168d718ac50919d3a98424ca247c3aba2273191ec681e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gcard.sty) \
texlive-gcard"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(graphicx.sty) \
tex(textpos.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
