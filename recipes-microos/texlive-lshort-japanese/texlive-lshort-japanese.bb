SUMMARY = "Japanese version of A Short Introduction to LaTeX2e"
DESCRIPTION = "The lshort-japanese package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn36207"

RPM_NAME = "texlive-lshort-japanese-2023.201.svn36207-54.1.noarch.rpm"
RPM_HASH = "0b4f5b6a576d941ae7ff54d951639d5ad4817a60a9dca44ed8d97634ae9d9a568ebbde5809269bcf79ee1da2b2c68cfec39b83cd5ee6538ab0588eb318d3c350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-japanese"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
