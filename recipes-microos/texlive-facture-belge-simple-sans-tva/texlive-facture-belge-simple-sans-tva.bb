SUMMARY = "Simple Belgian invoice without VAT"
DESCRIPTION = "This package can be used to generate invoices for Belgian \
individuals who do not have a VAT number and who wish to do \
occasional work, or to carry out paid additional activities \
during their free time up to 6,000 euros per calendar year \
(amount indexed annually) without having to pay tax or social \
security contributions (see the website Activites \
complementaires). The package can also generate expense \
reports. All totals are calculated automatically, in the \
invoice and in the expense report. The package depends on \
calctab, ifthen, hyperref, fancyhdr, multirow, eurosym, color, \
and colortbl."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn49004"

RPM_NAME = "texlive-facture-belge-simple-sans-tva-2023.201.2.1svn49004-52.1.noarch.rpm"
RPM_HASH = "daa5621d834b4f23bc7f1a731bc66a32c4ac49c2dfb36947d1214a8b99c5ae1f323b1aa991e8265eaf7ba6f815235e57da1401fb48fa4a8830424bc60e8ffc85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(facture-belge-simple-sans-tva.sty) \
texlive-facture-belge-simple-sans-tva"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
