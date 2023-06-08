SUMMARY = "Ruby annotations according to JIS X 4051"
DESCRIPTION = "This package provides a function to add ruby annotations \
(furigana) that follow the style conventional in Japanese \
typography as described in the W3C technical note 'Requirements \
for Japanese Text Layout' ([JLREQ]) and the JIS specification \
JIS X 4051. Starting with version 1.3, this package also \
provides a function to add kenten (emphasis marks) to Japanese \
text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-2023.201.1.3esvn66298-53.1.noarch.rpm"
RPM_HASH = "02d7ee62bbf01dc646175e57a2bc78f5bfdf3f42a36d3075a7d1eadd5d6d9b39378fe5d7623008b263060af34ee74aceaa0d6560d7cf6293aa47b69bc7a0e0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pxrubrica.sty) texlive-pxrubrica"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
