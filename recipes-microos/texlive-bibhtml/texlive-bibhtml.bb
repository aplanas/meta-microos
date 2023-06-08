SUMMARY = "BibTeX support for HTML files"
DESCRIPTION = "Bibhtml consists of a Perl script and a set of BibTeX style \
files, which together allow you to output a bibliography as a \
collection of HTML files. The references in the text are linked \
directly to the corresponding bibliography entry, and if a URL \
is defined in the entry within the BibTeX database file, then \
the generated bibliography entry is linked to this. The package \
provides three different style files derived from each of the \
standard plain.bst and alpha.bst, as well as two style files \
derived from abbrv.bst and unsrt.bst (i.e., eight in total)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.2svn31607"

RPM_NAME = "texlive-bibhtml-2023.201.2.0.2svn31607-53.1.noarch.rpm"
RPM_HASH = "1ee37af2b38ef4486a62148cde58c4ff1134e16fda1e6b2ffdcca2712ef02f82f5d1381051cb7ac8ce6feeb4c3431e46bb907a4f05d47ee503c0e9238d553e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibhtml"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
