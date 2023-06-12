SUMMARY = "Fix magnification in pdfTeX"
DESCRIPTION = "A recent change to pdfTeX has caused magnification to apply to \
page dimensions. This small package changes the values set in \
the page dimension variables from pt to truept, thus evading \
the effects of \\mag."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fixpdfmag-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "fd7526684edf0e756160e0cb6e98ea4b4b5088d4e1c223a8d64385df05f838301079b642bb5001382c742406eda5dc7dc660ebbbe559dccde7cd5c1ea347d5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixpdfmag.tex) \
texlive-fixpdfmag"
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
