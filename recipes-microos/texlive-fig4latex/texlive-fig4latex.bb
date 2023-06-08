SUMMARY = "Management of figures for large LaTeX documents"
DESCRIPTION = "Fig4LaTeX simplifies management of the figures in a large LaTeX \
document. Fig4LaTeX is appropriate for projects that include \
figures with graphics created by XFig -- in particular, \
graphics which use the combined PS/LaTeX (or PDF/LaTeX) export \
method. An example document (with its output) is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn26313"

RPM_NAME = "texlive-fig4latex-2023.201.0.0.2svn26313-52.1.noarch.rpm"
RPM_HASH = "31ae5f32d88aa3812b39e98db2d8194e0f593f5d4898c17e633feb94be8e0884232895f220c897df04684d91ce37bd47756cd0ac306719c0785e855a1a4899b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fig4latex"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep sed texlive texlive-fig4latex-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
