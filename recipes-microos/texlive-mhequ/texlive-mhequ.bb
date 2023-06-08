SUMMARY = "Multicolumn equations, tags, labels, sub-numbering"
DESCRIPTION = "The mhequ style file simplifies creating multi-column equation \
environments and tagging equations therein. It supports \
sub-numbering of blocks of equations (like (1.2a), (1.2b), etc) \
and references to each equation individually (1.2a) or to the \
whole block (1.2). The labels can be shown in draft mode. The \
default behaviour is to show an equation number if and only if \
the equation actually has a label, which reduces visual \
clutter. Comments in the package itself describe its usage, \
which should also be self-evident from the provided example \
file."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.72svn64978"

RPM_NAME = "texlive-mhequ-2023.201.1.72svn64978-54.1.noarch.rpm"
RPM_HASH = "080c4a71e35be0ea5f0e4a956df3d3b82563f42735bd9803199edbd9e378d47a29f563edb81bfe7fe5f661b9ec23e627adc2cda9550b4c496a45a4e4692ec668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mhequ.sty) texlive-mhequ"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
