SUMMARY = "Modern Russian typesetting"
DESCRIPTION = "The class offers modern Russian text formatting, in accordance \
with accepted design standards. Fonts not (apparently) \
available on CTAN are required for use of the class."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-eskd-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "b2641d2c15f1ac02f5d0e76ac8266cf75cf5cc02df11cac40d29f9d915bc5cc81800d0923698b7977b3a11d7f64efbfdaee658f47d058493096bdb44a5c95f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eskd.cls) texlive-eskd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(babel.sty) tex(fancyhdr.sty) tex(fontenc.sty) tex(ifthen.sty) tex(inputenc.sty) tex(keyval.sty) tex(lastpage.sty) tex(rotating.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
