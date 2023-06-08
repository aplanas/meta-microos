SUMMARY = "Romanian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'romanian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn56394"

RPM_NAME = "texlive-datetime2-romanian-2023.201.1.02svn56394-52.1.noarch.rpm"
RPM_HASH = "f13ec2016cfe71a5426ae18e621356c0c2a284d6c44d73a8219a2d42a63502e01ca393bec640de50709673861bc0a735c86ccfbc41fbcbc6a5acaeb59ae64f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-romanian-ascii.ldf) tex(datetime2-romanian-utf8.ldf) tex(datetime2-romanian.ldf) texlive-datetime2-romanian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
