SUMMARY = "Support for fancy frames"
DESCRIPTION = "The package defines means of drawing frames around boxes, using \
dingbat fonts. Some (Metafont) font sources are included; the \
fonts are available separately in Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1csvn36086"

RPM_NAME = "texlive-niceframe-2023.201.1.1csvn36086-54.1.noarch.rpm"
RPM_HASH = "b089da191f6d20b10cba83ecffc9450b57657532cdca4ed19ac42c22929a017d0d0d5d400c3f54b277c26a1dc4ccc9117bbdb5782b0590387c42e67872fd6e1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(karta15.tfm) \
tex(niceframe.sty) \
tex(umranda.tfm) \
tex(umrandb.tfm) \
texlive-niceframe"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
