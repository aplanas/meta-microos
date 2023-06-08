SUMMARY = "A class for making curriculum vitae"
DESCRIPTION = "CurVe is a class for writing a CV, with configuration for the \
language in which you write. The class provides a set of \
commands to create rubrics, entries in these rubrics etc. CurVe \
then format the CV (possibly splitting it onto multiple pages, \
repeating the titles etc), which is usually the most painful \
part of CV writing. Another nice feature of CurVe is its \
ability to manage different CV 'flavours' simultaneously. It is \
often the case that you want to maintain slightly divergent \
versions of your CV at the same time, in order to emphasize on \
different aspects of your background. CurVe also comes with \
support for use with AUC-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.16svn20745"

RPM_NAME = "texlive-curve-2023.204.1.16svn20745-54.1.noarch.rpm"
RPM_HASH = "fce351ecb791b2feae86ce32e1a2d619f151f731c4a4e46a3929f5d7fef93f6324c23b637d3fa6e1f5e3937a7a9eed634142c6fec9089e3e56c6935c2e22a00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(curve.cls) texlive-curve"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(filehook.sty) tex(graphicx.sty) tex(ifthen.sty) tex(ltxtable.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
