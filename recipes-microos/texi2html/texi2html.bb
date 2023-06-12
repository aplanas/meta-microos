SUMMARY = "Tool for converting texinfo documents to HTML"
DESCRIPTION = "The basic purpose of texi2html is to convert Texinfo documents into HTML, \
and other formats.  Configuration files written in perl provide fine degree \
of control over the final output, allowing most every aspect of the final \
output not specified in the Texinfo input file to be specified."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "texi2html-5.0-5.2.noarch.rpm"
RPM_HASH = "d064ed9844499beb893e73c1870b7197f46551504761126e0a5f3f7c7af71d8a4cbcff28b64b721af265a13930a8cfba2fdaa95abcc29f8b3e5d3d772866b1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texi2html \
texinfo:/usr/bin/texi2html"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
perl(Unicode::EastAsianWidth) \
perl-Text-Unidecode \
perl-gettext \
perl-libintl-perl"

inherit rpm
