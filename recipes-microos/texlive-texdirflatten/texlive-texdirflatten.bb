SUMMARY = "Collect files related to a LaTeX job in a single directory"
DESCRIPTION = "The Perl script parses a LaTeX file recursively, scanning all \
child files, and collects details of any included and other \
data files. These component files, are then all put into a \
single directory (thus 'flattening' the document's directory \
tree)."
LICENSE = "Artistic-1.0"

PV = "2023.201.1.3svn55064"

RPM_NAME = "texlive-texdirflatten-2023.201.1.3svn55064-54.1.noarch.rpm"
RPM_HASH = "dab5647f6d3550fe7a5602b651ca6a441221c4abc641f19ec079002387e8d7de3d9ff82c85a9d717e65ff9fe3ef6ae4678d76df60009aac06124d2207f713ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdirflatten"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Getopt::Long) perl(Pod::Usage) perl(re) perl(strict) perl(warnings) sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-texdirflatten-bin"

inherit rpm
