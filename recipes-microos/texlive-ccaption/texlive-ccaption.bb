SUMMARY = "Continuation headings and legends for floats"
DESCRIPTION = "A package providing commands for 'continuation captions', \
unnumbered captions, and also a non-specific legend heading for \
any environment. Methods are also provided to define captions \
for use outside float (e.g., figure and table) environments, \
and to define new float environments and Lists of Floats. Tools \
are provided for specifying your own captioning styles."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2csvn23443"

RPM_NAME = "texlive-ccaption-2023.201.3.2csvn23443-52.1.noarch.rpm"
RPM_HASH = "f410580640ec7676532407a26f4e8a0be9996590542f39e42d23071226013d9594c43520122bfaeec2ccd4fa769bf843072dbb8c39c39e2176fa836b2f136045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ccaption.sty) texlive-ccaption"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
