SUMMARY = "Estonian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'estonian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47565"

RPM_NAME = "texlive-datetime2-estonian-2023.201.1.1svn47565-52.1.noarch.rpm"
RPM_HASH = "3ea99a71f1005dfaa4ac70fd8c20c3fb88f0e5a31f467c95bd74271576e35a61c61e349fb1784be60ebc62c11b5346c3d7d377da09c48cc0f0950f218f987806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-estonian-ascii.ldf) tex(datetime2-estonian-utf8.ldf) tex(datetime2-estonian.ldf) texlive-datetime2-estonian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
