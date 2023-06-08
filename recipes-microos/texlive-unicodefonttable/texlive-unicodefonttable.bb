SUMMARY = "A Unicode font table generator"
DESCRIPTION = "This package produces font tables for unicode fonts as well as \
for 8bit fonts. The table layout can be adjusted in various \
ways including restricting the range of output to show only a \
portion of a specific font. To quickly produce a one-off table \
there is a stand-alone version unicodefont.tex that asks you a \
few questions and then generates the table --- somewhat similar \
to nfssfont.tex for 8-bit fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0gsvn65009"

RPM_NAME = "texlive-unicodefonttable-2023.201.1.0gsvn65009-53.1.noarch.rpm"
RPM_HASH = "c5acc97bf391ef219a3a3654a6abfc5a5f123146885eb6bea34a5c589f64814a90a0c17af1edce1f47e62c0338f8b16cbec6018d53523587a95ba33b60f9b42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unicodefont.tex) tex(unicodefonttable.sty) texlive-unicodefonttable"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(booktabs.sty) tex(caption.sty) tex(fontspec.sty) tex(l3keys2e.sty) tex(longtable.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
