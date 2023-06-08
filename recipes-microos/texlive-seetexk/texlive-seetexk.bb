SUMMARY = "Utilities for manipulating DVI files"
DESCRIPTION = "The collection comprises: dvibook, which will rearrange the \
pages of a DVI file into 'signatures' as used when printing a \
book; dviconcat, for concatenating pages of DVI file(s); \
dviselect, which will select pages from one DVI file to create \
a new DVI file; dvitodvi, which will rearrange the pages of a \
DVI file to create a new file; and libtex, a library for \
manipulating the files, from the old SeeTeX project. The \
utilities are provided as C source with Imakefiles, and an \
MS-DOS version of dvibook is also provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57972"

RPM_NAME = "texlive-seetexk-2023.201.svn57972-53.1.noarch.rpm"
RPM_HASH = "dfb8774fe045af81375646e5346a2bffa323b982ee4a311a60240173708eaeb85157a3e8c97b2456f00ac5e5d327dd2b10a649578b84e855a56b26d4fd3c3d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dvibook.1) man(dviconcat.1) man(dviselect.1) man(dvitodvi.1) texlive-seetexk"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-seetexk-bin"

inherit rpm
