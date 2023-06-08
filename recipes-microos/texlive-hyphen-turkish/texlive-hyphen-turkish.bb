SUMMARY = "Turkish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkish in T1/EC and UTF-8 encodings. \
Auto-generated from a script included in the distribution. The \
patterns for Turkish were first produced for the Ottoman Texts \
Project in 1987 and were suitable for both Modern Turkish and \
Ottoman Turkish in Latin script, however the required character \
set didn't fit into EC encoding, so support for Ottoman Turkish \
had to be dropped to keep compatibility with 8-bit engines."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-turkish-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "e7f6847f64319dcaba24c8221783aaaba4081254e2c904fc31e903965f18c7761e09714436bbfca20e5ea1f595ac47f641135758977feda22c24cdb81efddad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-tr.ec.tex) tex(hyph-tr.tex) tex(loadhyph-tr.tex) texlive-hyphen-turkish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
