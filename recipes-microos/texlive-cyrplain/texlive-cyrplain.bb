SUMMARY = "Support for using T2 encoding"
DESCRIPTION = "The T2 bundle provides a variety of separate support functions \
for using Cyrillic characters in LaTeX: the mathtext package, \
for using Cyrillic letters 'transparently' in formulae; the \
citehack package, for using Cyrillic (or indeed any non-ascii) \
characters in citation keys; support for Cyrillic in BibTeX; \
support for Cyrillic in Makeindex; and various items of font \
support."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn45692"

RPM_NAME = "texlive-cyrplain-2023.204.svn45692-54.1.noarch.rpm"
RPM_HASH = "ec9387b6d50d5236ad23501d2cf4e34fc756fb3023f4372ea2f8c88777f5b06bf64f3c2f14af9a07d62f2bdbe5b8c303ec3b50464f6369f7dc7ee802550155db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-cyrplain) tex(cyrcmfnt.tex) tex(cyrecfnt.tex) tex(cyrtex.cfg) tex(cyrtex.tex) tex(plainenc.tex) tex(txxdefs.tex) tex(txxextra.tex) texlive-cyrplain"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
