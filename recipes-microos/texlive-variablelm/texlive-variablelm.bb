SUMMARY = "Font definitions for the variable Latin Modern fonts"
DESCRIPTION = "This package provides a mechanism for scaling a typeface. It is \
directed at the Latin Modern fonts and provides the font \
definitions and the corresponding style file. This mechanism is \
useful in mixed text compositions, for example Japanese-Latin."
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.2svn60014"

RPM_NAME = "texlive-variablelm-2023.201.1.2svn60014-53.1.noarch.rpm"
RPM_HASH = "365e60fa3825ddaa42721889889e99fd2a358e99a252b1cf51b3efd1f679ac132cb4f232d8b8f0e44b17dadff9ce5263e1229a755a50c17a38d6c21aa6ee31f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(omlvlmm.fd) tex(omlvlmr.fd) tex(omsvlmr.fd) tex(omsvlmsy.fd) tex(omxvlmex.fd) tex(ot1vlmr.fd) tex(ot1vlmtt.fd) tex(t1vlmr.fd) tex(t1vlmss.fd) tex(t1vlmssq.fd) tex(t1vlmtt.fd) tex(t1vlmvtt.fd) tex(ts1vlmr.fd) tex(variablelm.sty) texlive-variablelm"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(fontenc.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
