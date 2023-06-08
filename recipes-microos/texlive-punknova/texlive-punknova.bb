SUMMARY = "OpenType version of Knuth's Punk font"
DESCRIPTION = "The font was generated from a MetaPost version of the sources \
of the 'original' punk font. Knuth's original fonts generated \
different shapes at random. This isn't actually possible in an \
OpenType font; rather, the font contains several variants of \
each glyph, and uses the OpenType randomize function to select \
a variant for each invocation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.003svn24649"

RPM_NAME = "texlive-punknova-2023.201.1.003svn24649-53.1.noarch.rpm"
RPM_HASH = "e3abb82215b0d5745e6f4fb2f20ec9104200e4e39a5eec8da004ef828e94e3278dc4b4d7a91228c3e55bce162231a8c95214c94402f05f64a7cdab0301ca2b9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-punknova-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
