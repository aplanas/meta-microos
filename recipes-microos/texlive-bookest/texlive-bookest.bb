SUMMARY = "Extended book class"
DESCRIPTION = "The class extends the standard book class, in the areas of \
colour scheme management, document layout, headings and \
footers, front page layout, and other minor items."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-bookest-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "44c21e019322be3a6925cc1ab722ff3212e8711bfa77d6b7ee0b1b4e8bd058fde87e974fd3f1e87a9fe1627d6cdd52fea702bf4a4ff1ad14de3a709fd87fd55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bookest.cls) texlive-bookest"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(book.cls) tex(color.sty) tex(eso-pic.sty) tex(everyshi.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(setspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
