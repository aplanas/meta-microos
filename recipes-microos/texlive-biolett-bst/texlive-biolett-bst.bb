SUMMARY = "A BibTeX style for the journal 'Biology Letters'"
DESCRIPTION = "This package provides a BibTeX style (.bst) file for the \
journal 'Biology Letters' published by the Royal Society. This \
style was produced independently and hence has no formal \
approval from the Royal Society."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-biolett-bst-2023.201.svn66115-52.1.noarch.rpm"
RPM_HASH = "a0bc6a04afab5c7407b60d4fe273a9b919bdff063bb2416d95c52d924bc416440147f29d4c67970eafca690799a8d74dadc7809705f5e85a2a24935c5b316014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biolett-bst"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
