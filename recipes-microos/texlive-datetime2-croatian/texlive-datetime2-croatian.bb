SUMMARY = "Croatian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'croatian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36682"

RPM_NAME = "texlive-datetime2-croatian-2023.201.1.0svn36682-52.1.noarch.rpm"
RPM_HASH = "aba696973c7ca78cad951790c0223b2cf708a11c23f676d58aea1fa5b056e021ae08afc8f1a0f1e243e74350b53082fafc491693caece40a73695f82950d8d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-croatian-ascii.ldf) tex(datetime2-croatian-utf8.ldf) tex(datetime2-croatian.ldf) texlive-datetime2-croatian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
