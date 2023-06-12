SUMMARY = "Store counter values per chapter"
DESCRIPTION = "This package stores values of counters (which have been \
registered beforehand) on a per chapter base and provides the \
values on demand in the 2nd LaTeX compilation run. In this way \
it is possible to know how many sections etc. there are lying \
ahead and to react to these counter values, if needed. This is \
a preliminary version that has been tested with book.cls, \
memoir.cls, and scrbook.cls. The packages assoccnt (by the same \
author) and xparse are needed as well."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn37572"

RPM_NAME = "texlive-cntperchap-2023.201.0.0.3svn37572-53.1.noarch.rpm"
RPM_HASH = "6c1e624de38d2ad0ffa365adc232b873c7e3daed10759d4def947fe2e697d7a0665743bcf503e8d94eedbad452675a0aff9b306b39af103516fab847cdb76f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cntperchap.sty) \
texlive-cntperchap"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(assoccnt.sty) \
tex(ifthen.sty) \
tex(morewrites.sty) \
tex(xparse.sty) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
