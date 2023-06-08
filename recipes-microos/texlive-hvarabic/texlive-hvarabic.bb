SUMMARY = "Macros for RTL typesetting"
DESCRIPTION = "This package provides some macros for right-to-left \
typesetting. It uses by default the arabic fonts Scheherazade \
and ALM fixed, the only monospaced arabic font. The package \
works with LuaLaTeX or XeLaTeX, but not with pdfLaTeX or latex."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn59423"

RPM_NAME = "texlive-hvarabic-2023.201.0.0.02svn59423-52.1.noarch.rpm"
RPM_HASH = "baf56caf7dc802e45bab1632a7d7390798f5de57dbb9fe35ccebcd7d48c5ae33f98e86aa9a30af43305955c90e2fdb7d9f011aba69bf1872c939989b347aba23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hvarabic.sty) texlive-hvarabic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontspec.sty) tex(iftex.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
