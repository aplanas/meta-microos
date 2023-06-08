SUMMARY = "Upright Greek letters in chemistry"
DESCRIPTION = "The package provides upright Greek letters in support of other \
chemistry packages (such as chemmacros). The package used to be \
distributed as a part of chemmacros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn53437"

RPM_NAME = "texlive-chemgreek-2023.201.1.1asvn53437-53.1.noarch.rpm"
RPM_HASH = "bc179f07a2716b7aebcc9360ea103f84e6d5da3bcf1677d6f4fb8039fd6d5cb800dba694427128bad5746cae5e5eeb572e9f089966ac37accd38171a3ad87cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemgreek.sty) texlive-chemgreek"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amstext.sty) tex(expl3.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
