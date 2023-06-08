SUMMARY = "Convert Japanese TeX documents to PDF"
DESCRIPTION = "The Lua script provides system-independent support of Japanese \
typesetting engines in TeXworks. As TeXworks typesetting setup \
does not allow for multistep processing, this script runs one \
of the ptex-based programs (ptex, uptex, eptex, platex, \
uplatex) followed by dvipdfmx."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-2023.201.20200520.0svn65953-53.1.noarch.rpm"
RPM_HASH = "8697dbc010d9c3fc5ad829fa76b065ba225fcbe14bf6efba3c3462a3f550c0018fc8c81186a031eb0478c4d29e8b3c5ad5d6c5353de83d556efe852573119c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep perl perl(TeXLive::TLUtils) sed tex(texmf.cnf) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-ptex2pdf-bin texlive-scripts texlive-scripts-bin texlive-texlive.infra"

inherit rpm
