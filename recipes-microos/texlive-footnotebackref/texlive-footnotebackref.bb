SUMMARY = "Back-references from footnotes"
DESCRIPTION = "The package provides the means of creating hyperlinks, from a \
footnote at the bottom of the page, back to the occurence of \
the footnote in the main text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27034"

RPM_NAME = "texlive-footnotebackref-2023.201.1.0svn27034-52.1.noarch.rpm"
RPM_HASH = "b3fc4af9e56a691a8787dd889ce69af6fa8f9f9798d5d2a3e1a5c2f69391d53f8ed557a6d8ac8a99851309222702eedf86d1a49db917b69d493fe8920662c10f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(footnotebackref.sty) \
texlive-footnotebackref"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
tex(kvoptions.sty) \
tex(letltxmacro.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
