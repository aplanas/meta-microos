SUMMARY = "Decorate text with linear gradient colors"
DESCRIPTION = "This package enables writers to conveniently decorate text with \
linear gradient colors. The RGB values of the first and the \
last character are specified as parameters while the rest of \
the text is colored automatically."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65567"

RPM_NAME = "texlive-gradient-text-2023.201.1.2svn65567-53.1.noarch.rpm"
RPM_HASH = "bac82f57f7fa068f8b3543b92b5b17a1fe6ad7ab0b805ba65e5befa3e79b6c4af510dd7565348a32fe9dca5a2c7d68ecca46cb9bb0ea3f8e552ed54e71cacc0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gradient-text.sty) texlive-gradient-text"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
