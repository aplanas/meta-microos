SUMMARY = "Modification of inputenc for German"
DESCRIPTION = "If the inputenc is used and German umlauts are input directly, \
they are converted to the LICR representation \\'a (etc.). This \
breaks the sort algorithm of makeindex, for instance. Ginpenc \
converts umlauts and the sharp-s to the short forms defined by \
babel, e.g., 'a instead, if the text is typeset in German."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24980"

RPM_NAME = "texlive-ginpenc-2023.201.1.0svn24980-52.1.noarch.rpm"
RPM_HASH = "31fb7f227e4039364f70238bf5ef8a6fed768ec89f66b45c7ec1eb18661ce5950ba0767d2a29b6b4420f04c35d564b1703d91f459e2bb6c2b537d69f15316ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ginpenc.sty) texlive-ginpenc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
