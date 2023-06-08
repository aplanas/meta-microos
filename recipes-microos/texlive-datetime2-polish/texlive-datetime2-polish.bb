SUMMARY = "Polish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'polish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48456"

RPM_NAME = "texlive-datetime2-polish-2023.201.1.1svn48456-52.1.noarch.rpm"
RPM_HASH = "36a60b463b93f05e3bd894e481b808e0b8ac2eab42b3c3fbf2572c822e552b0a29b9f8a913b226a8e78ef8b4c174b002de7f81d88dd076c3331a4bc3e6915b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-polish-ascii.ldf) tex(datetime2-polish-utf8.ldf) tex(datetime2-polish.ldf) texlive-datetime2-polish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
