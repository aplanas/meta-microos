SUMMARY = "Support for users uploading to CTAN"
DESCRIPTION = "The package provides a Perl script that allows the uploads of a \
contribution to CTAN from the command line. The aim is to \
simplify the release process for LaTeX package authors. Note by \
the CTAN team (2015-02-05): It seems that this script is \
currently not working."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.1.2csvn26313"

RPM_NAME = "texlive-ctanupload-2023.204.1.2csvn26313-54.1.noarch.rpm"
RPM_HASH = "edda7be0ed902e354d165437bf2a19603486ffd8a16a7b076b9327903922b786a86e3166e745842d3661c081068529cfe44a1407079086a982dbfd06852b587f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanupload"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(HTML::FormatText) perl(HTML::TreeBuilder) perl(WWW::Mechanize) perl(strict) perl(warnings) sed texlive texlive-ctanupload-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
