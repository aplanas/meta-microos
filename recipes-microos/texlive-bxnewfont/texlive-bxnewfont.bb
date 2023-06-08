SUMMARY = "Enhanced \\newfont command"
DESCRIPTION = "This package provides a new command \\newfontx. It is similar to \
the old (and deprecated) command \\newfont in function, but is \
more compatible with NFSS. In particular, one can safely change \
font size after invoking a font command defined by \\newfontx. \
The new command will be useful to users who know much of the \
old \\newfont command, but are unfamiliar with the details of \
NFSS."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn44173"

RPM_NAME = "texlive-bxnewfont-2023.201.0.0.2bsvn44173-52.1.noarch.rpm"
RPM_HASH = "d2b43cfb2f139cc31b77a97a09b9e4030f3746bf53ce1d5a0c3c20cd181c0a42388c18bdc4242ad48acc73d6ba577e72e665c82e253608cd7957f4ae4df16c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxnewfont.sty) texlive-bxnewfont"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
