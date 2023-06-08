SUMMARY = "Breton language module for the datetime2 package"
DESCRIPTION = "This module provides the 'breton' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52647"

RPM_NAME = "texlive-datetime2-breton-2023.201.1.2svn52647-52.1.noarch.rpm"
RPM_HASH = "86d19934e0e46bc89a37ed6d1bcd48af394bc61b3435845f6a9347d953074459e63ee90c57ae248127c47eeb13551bd448d361a37a49fba8b5274b8ce2bbf666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-breton-ascii.ldf) tex(datetime2-breton-utf8.ldf) tex(datetime2-breton.ldf) texlive-datetime2-breton"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
