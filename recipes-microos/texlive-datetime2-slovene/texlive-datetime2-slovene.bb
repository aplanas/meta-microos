SUMMARY = "Slovene language module for the datetime2 package"
DESCRIPTION = "This module provides the 'slovene' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52282"

RPM_NAME = "texlive-datetime2-slovene-2023.201.1.1svn52282-52.1.noarch.rpm"
RPM_HASH = "b1a53b4b9c7f58a9eb6696dedaa56fbc84f9bdf4ad432e1d7775aae5f179347d2109fe23c222179fc88cbbfff190558e96352f718ca8083bbe1426a1ec9c9118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-slovene-ascii.ldf) tex(datetime2-slovene-utf8.ldf) tex(datetime2-slovene.ldf) texlive-datetime2-slovene"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
