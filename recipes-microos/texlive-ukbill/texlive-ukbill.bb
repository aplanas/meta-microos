SUMMARY = "A class for typesetting UK legislation"
DESCRIPTION = "This package provides formatting to easily typeset draft UK \
legislation. The libre font Palatine Parliamentary is required \
to use this package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn65485"

RPM_NAME = "texlive-ukbill-2023.201.1.0.2svn65485-53.1.noarch.rpm"
RPM_HASH = "eec090a2dd48e000b7efd401c42165c52cee655456d30bdac5e99a0e498dfc54666856fa8aa441c655fbdcbc8d1e63cf95b08c8a0f0734a8debfcae834406195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ukbill.cls) texlive-ukbill"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(ccicons.sty) tex(changepage.sty) tex(enumitem.sty) tex(fontspec.sty) tex(geometry.sty) tex(hyphenat.sty) tex(lettrine.sty) tex(memoir.cls) tex(paralist.sty) tex(setspace.sty) tex(textpos.sty) tex(titlesec.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
