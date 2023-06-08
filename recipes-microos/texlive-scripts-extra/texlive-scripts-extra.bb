SUMMARY = "TeX Live scripts"
DESCRIPTION = "Miscellaneous scripts maintained as part of TeX Live, but not \
important for the infrastructure. Thus, this is not part of \
scheme-infraonly or tlcritical, just a normal package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62517"

RPM_NAME = "texlive-scripts-extra-2023.201.svn62517-54.1.noarch.rpm"
RPM_HASH = "219ebc68917f2aa44784eb54ca3190598d4809e8956d5c52e7058d3b9d1d1be2cb54b7e35401d2313fabea1cc022e670fa2c4a1adde215662d4dd7d333f15516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tcfmgr.map) texlive-scripts-extra texlive-texconfig:/usr/share/texmf/texconfig/README texlive-texconfig:/usr/share/texmf/texconfig/tcfmgr texlive-texconfig:/usr/share/texmf/texconfig/tcfmgr.map"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep sed terminfo-base tex(psfrag.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-scripts-extra-bin"

inherit rpm
