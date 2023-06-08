SUMMARY = "Environments and options for typesetting university assignments"
DESCRIPTION = "The purpose of this package is to provide simple question and \
solution style environments for typesetting university \
assignments."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn38459"

RPM_NAME = "texlive-uassign-2023.201.1.01svn38459-52.1.noarch.rpm"
RPM_HASH = "f671abc76d68aefec5a03af6f269ef018d5463c26dae45728a27b3c41b3ea254be73589ca1a4bb9829af3bc89b48b95daeda9492f5bcb2625ad5c96552faead9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uassign.sty) texlive-uassign"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amsthm.sty) tex(bookmark.sty) tex(color.sty) tex(enumerate.sty) tex(fancyhdr.sty) tex(hyperref.sty) tex(ifthen.sty) tex(titlesec.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
