SUMMARY = "Bibliographies conforming to French typographic standards"
DESCRIPTION = "The package provides bibliographies (in French) conforming to \
the rules in 'Guide de la communication ecrite' (Malo, M., \
Quebec Amerique, 1996. ISBN 978-2-8903-7875-9) The BibTeX \
styles were generated using custom-bib and they are compatible \
with natbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38922"

RPM_NAME = "texlive-francais-bst-2023.201.1.1svn38922-52.1.noarch.rpm"
RPM_HASH = "1e76cd99104f147e76d5abf2017f662d4a105a7cc9d85c5b6483080e9d89de4d34ec5e7b6d596c8ebfc3c18ce96ca49f83cba294e12bba8011ee39b35278e77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(francaisbst.tex) texlive-francais-bst"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
