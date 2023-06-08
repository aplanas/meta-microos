SUMMARY = "Introducing scientific/mathematical documents using LaTeX"
DESCRIPTION = "'Writing Scientific Documents Using LaTeX' is an article \
introducing the use of LaTeX in typesetting scientific \
documents. It covers the basics of creating a new LaTeX \
document, special typesetting considerations, mathematical \
typesetting and graphics. It also touches on bibliographic data \
and BibTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.5th_editionsvn15878"

RPM_NAME = "texlive-intro-scientific-2023.201.5th_editionsvn15878-52.1.noarch.rpm"
RPM_HASH = "cbaad3755b052d4cc2bc1425856579afe89d39741e53b8539dcec1b9047568e6b506e9d2c70f3e640703a3d86cb1815c44ec30014cffe6ceae329d53a6f8ef39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intro-scientific"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
