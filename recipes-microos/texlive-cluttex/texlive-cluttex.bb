SUMMARY = "An automation tool for running LaTeX"
DESCRIPTION = "This is another tool for the automation of LaTeX document \
processing, like latexmk or arara. The main feature of this \
tool is that it does not clutter your working directory with \
.aux or .log or other auxiliary files. It has of course the \
usual features of automation tools: It automatically re-runs \
(La)TeX for cross-references. MakeIndex, BibTeX, Biber, or \
makeglossaries will be executed if a corresponding option is \
set. Furthermore, cluttex can watch input files for changes \
(using an external program)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5.1svn60964"

RPM_NAME = "texlive-cluttex-2023.201.0.0.5.1svn60964-53.1.noarch.rpm"
RPM_HASH = "e58f4b3de88bf6680fa656ac9528c808f8b38c972fd533f71706788c39a92a97fed8366ba5ddbb9d992117fa71991eb75066bf57610872d0dc5f1bdd033eb136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cluttex"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep sed texlive texlive-cluttex-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
