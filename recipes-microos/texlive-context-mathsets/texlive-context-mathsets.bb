SUMMARY = "Set notation in ConTeXt"
DESCRIPTION = "Typeset good-looking set notation (e.g., {x|x \\in Y}), as well \
as similar things such as Dirac bra-ket notation, conditional \
probabilities, etc. The package is at least inspired by braket."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-mathsets-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "f33c27e6a6ee44750839598810a5a60bd27b5dcd3905e0a7512a57265388d56124f72ea3e4752465431ae00e3cfe5ae125c95e1c17c185c3719f88a216e776f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-mathsets.tex) texlive-context-mathsets"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
