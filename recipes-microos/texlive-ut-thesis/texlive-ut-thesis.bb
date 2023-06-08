SUMMARY = "University of Toronto thesis style"
DESCRIPTION = "This LaTeX document class implements the formatting \
requirements of the University of Toronto School of Graduate \
Studies (SGS), as of Fall 2020 ( \
https://www.sgs.utoronto.ca/academic-progress/program-completio \
n/formatting). For example usage, see the GitHub repository."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.7svn65767"

RPM_NAME = "texlive-ut-thesis-2023.201.3.1.7svn65767-53.1.noarch.rpm"
RPM_HASH = "3da570f7537504694d8d0f3b9b7397b6df23a1aeef631e2c0f18b4230220a43ba25fbc81c1bcd7c1ca21fbbbb9b7e220f1c1da96f35137a21de8852d9e7cb0de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ut-thesis.cls) texlive-ut-thesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(book.cls) tex(geometry.sty) tex(setspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
