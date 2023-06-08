SUMMARY = "Italian full text styles for the datetime2 package"
DESCRIPTION = "Italian date and time styles that use words for the numbers and \
ordinals. This package provides the following date and time \
styles: 'it-fulltext' and 'it-fulltext-twenty-four'. The first \
style uses a format 'am pm', the second a format '24 hours'. \
The necessary packages are datetime2, itnumpar, ifxetex, and \
ifluatex. This package is the translation and adaptation of \
datetime2-en-fulltext."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54779"

RPM_NAME = "texlive-datetime2-it-fulltext-2023.201.1.6svn54779-52.1.noarch.rpm"
RPM_HASH = "024f57acef9232b8dba222dc74a0a55e7a5289abba4ad668c8d5524bb01ed0d7999c71de1754e977d408baa51235b75db52beb655f7c498bc732f83c979ec3d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-it-fulltext-ascii.ldf) tex(datetime2-it-fulltext-utf8.ldf) tex(datetime2-it-fulltext.sty) texlive-datetime2-it-fulltext"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(datetime2.sty) tex(ifluatex.sty) tex(ifxetex.sty) tex(itnumpar.sty) texlive texlive-filesystem texlive-iftex texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
