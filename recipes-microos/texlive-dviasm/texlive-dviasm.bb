SUMMARY = "A utility for editing DVI files"
DESCRIPTION = "A Python script to support changing or creating DVI files via \
disassembling into text, editing, and then reassembling into \
binary format. It supports advanced features such as adding a \
preprint number or watermarks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64430"

RPM_NAME = "texlive-dviasm-2023.201.svn64430-53.1.noarch.rpm"
RPM_HASH = "3c71130d2ac5955262ece42fa379d70afb4da8d8e313fd81c707c53d34f6c2a118608366cd3d286fb0488b1ab0708b6093d2bf485c0f6dd975ab10b9c843caa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviasm"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 coreutils ed findutils grep sed texlive texlive-dviasm-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
