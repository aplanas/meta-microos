SUMMARY = "Customised BibTeX styles"
DESCRIPTION = "Package generating customized BibTeX bibliography styles from a \
generic file using docstrip driven by parameters generated by a \
menu application. Includes support for the Harvard style of \
citations."
LICENSE = "LPPL-1.0"

PV = "2023.204.4.33svn24729"

RPM_NAME = "texlive-custom-bib-2023.204.4.33svn24729-54.1.noarch.rpm"
RPM_HASH = "1a3e46e70976696f8ec023f13c016798bf74a10dea91270c6267b69a91e73bb6177063639f358f14f488b87aba9f14b2113d90f46c8fd4612daf7fa7fd6ab443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(geophys.tex) \
tex(makebst.tex) \
tex(shorthnd.tex) \
texlive-custom-bib"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
