SUMMARY = "Make chapters be typeset like sections"
DESCRIPTION = "The command \\simplechapter sets up the \\chapter command not to \
number chapters, though they may possibly have a prefix, and a \
suffix (the \\simplechapterdelim command, which the user may \
alter). The \\restorechapter command restores the status quo \
ante."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn17049"

RPM_NAME = "texlive-anonchap-2023.201.1.1asvn17049-54.1.noarch.rpm"
RPM_HASH = "77e47eff34ff0903b0fc792ecc754fe0e64da992ae2f656f4d5f2f5c2bb71c8d2d82dcc57fab11bf7b7bc8d55b551783fce36d0386d8ef0cb7ff93d565abe4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(anonchap.sty) texlive-anonchap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
