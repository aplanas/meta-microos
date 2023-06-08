SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.2020svn54080"

RPM_NAME = "texlive-impatient-fr-2023.201.2020svn54080-52.1.noarch.rpm"
RPM_HASH = "e3ae9004b10ea55b68988bdc05fb560dc8275d570cc0101f43b6fbe01524e442cd6fdb8c710c621846fb27438bc71bd711c78a4986d424a279eb226e481c90a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient-fr"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
