SUMMARY = "Generate an invoice"
DESCRIPTION = "Une classe simple permettant de produire une facture, avec ou \
sans TVA, avec gestion d'une adresse differente pour la \
livraison et pour la facturation. A simple class that allows \
production of an invoice, with or without VAT; different \
addresses for delivery and for billing are permitted."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn43865"

RPM_NAME = "texlive-facture-2023.201.1.2.2svn43865-52.1.noarch.rpm"
RPM_HASH = "47a85cd94044c556b45325f96a2b660d850ca01006733611277de9bb455149fedcee68f6ebb25f27d983f3b5d2c7a9e3e82dd384efd5ea34aa75f2b413d13f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(facture.cls) \
texlive-facture"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(advdate.sty) \
tex(array.sty) \
tex(article.cls) \
tex(colortbl.sty) \
tex(fancyhdr.sty) \
tex(fltpoint.sty) \
tex(fontspec.sty) \
tex(graphicx.sty) \
tex(longtable.sty) \
tex(numprint.sty) \
tex(polyglossia.sty) \
tex(tikz.sty) \
tex(xargs.sty) \
tex(xunicode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
