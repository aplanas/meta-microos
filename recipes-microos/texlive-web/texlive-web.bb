SUMMARY = "The original literate programming system"
DESCRIPTION = "The system processes 'web' files in two ways: firstly to \
rearrange them to produce compilable code (using the program \
tangle), and secondly to produce a TeX source (using the \
program weave) that may be typeset for comfortable reading."
LICENSE = "SUSE-TeX"

PV = "2023.201.4.5svn66186"

RPM_NAME = "texlive-web-2023.201.4.5svn66186-53.1.noarch.rpm"
RPM_HASH = "8b0bc536883b13dd3b796c3fe28ed9cfd09e5ac52469a427e4fea3309c215721264ec573382d9206dda396964925df6f7fd0a49bae874a3d5d9ce49a23cc49ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(tangle.1) man(weave.1) texlive-web"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-web-bin"

inherit rpm
