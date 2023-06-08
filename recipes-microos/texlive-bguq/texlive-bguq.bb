SUMMARY = "Improved quantifier stroke for Begriffsschrift packages"
DESCRIPTION = "The font contains a single character: the Begriffsschrift \
quantifier (in several sizes), as used to set the \
Begriffsschrift (concept notation) of Frege. The font is not \
intended for end users; instead it is expected that it will be \
used by other packages which implement the Begriffsschrift. An \
(unofficial) modified version of Josh Parsons' begriff is \
included as an example of implementation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn27401"

RPM_NAME = "texlive-bguq-2023.201.0.0.4svn27401-53.1.noarch.rpm"
RPM_HASH = "9e3f92f2a0beb63903c7e1ea0a0daa0f725f740eaedda8ba414069ff4f898cd60af510797292abdde4bbb7b17a272212a1b77e3e4a6f3ae18ab03bd414bc4e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Ubguq04.fd) tex(Ubguq05.fd) tex(Ubguq06.fd) tex(Ubguq07.fd) tex(Ubguq08.fd) tex(Ubguq09.fd) tex(Ubguq10.fd) tex(Ubguq11.fd) tex(Ubguq12.fd) tex(begriff-bguq.sty) tex(bguq.cfg) tex(bguq.map) tex(bguq.sty) tex(bguq10t04.tfm) tex(bguq10t05.tfm) tex(bguq10t06.tfm) tex(bguq10t07.tfm) tex(bguq10t08.tfm) tex(bguq10t09.tfm) tex(bguq10t10.tfm) tex(bguq10t11.tfm) tex(bguq10t12.tfm) texlive-bguq"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(updmap.cfg) texlive texlive-bguq-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
