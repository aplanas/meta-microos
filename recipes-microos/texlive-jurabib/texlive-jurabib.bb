SUMMARY = "Extended BibTeX citation support for the humanities and legal texts"
DESCRIPTION = "This package enables automated citation with BibTeX for legal \
studies and the humanities. In addition, the package provides \
commands for specifying editors in a commentary in a convenient \
way. Simplified formatting of the citation as well as the \
bibliography entry is also provided. It is possible to display \
the (short) title of a work only if an authors is cited with \
multiple works. Giving a full citation in the text, conforming \
to the bibliography entry, is supported. Several options are \
provided which might be of special interest for those outside \
legal studies--for instance, displaying multiple full \
citations. In addition, the format of last names and first \
names of authors may be changed easily. Cross references to \
other footnotes are possible. Language dependent handling of \
bibliography entries is possible by the special language field."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-jurabib-2023.201.0.0.6svn15878-55.1.noarch.rpm"
RPM_HASH = "cbb2687302afb77a9e4b4f6b08c84786d2d81d550767dbb6c37f53dd6b2c73e6c4e4a540b5ab5dec96a92711851bad9dfb908852b5923ca2af1ddd25a912b9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dajbbib.ldf) tex(dejbbib.ldf) tex(dujbbib.ldf) tex(enjbbib.ldf) tex(fijbbib.ldf) tex(frjbbib.ldf) tex(itjbbib.ldf) tex(jblong.cfg) tex(jurabib.cfg) tex(jurabib.sty) tex(nojbbib.ldf) tex(ptjbbib.ldf) tex(spjbbib.ldf) texlive-jurabib"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(bibunits.sty) tex(calc.sty) tex(hyperref.sty) tex(ifthen.sty) tex(keyval.sty) tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
