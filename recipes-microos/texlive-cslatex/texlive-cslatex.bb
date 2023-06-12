SUMMARY = "LaTeX support for Czech/Slovak typesetting"
DESCRIPTION = "The cslatex package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn66186"

RPM_NAME = "texlive-cslatex-2023.204.svn66186-54.1.noarch.rpm"
RPM_HASH = "2854f184fff2354bd9839c920d617fc5df36e2bb68dd050746d47cacb22915413e5968e85175db3140b2bc3837d7778e70c6612b894d83faa20e951cc99b4a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cspsfont.tex) \
tex(czech.sty) \
tex(fonttext.cfg) \
tex(hyphen.cfg) \
tex(il2cmdh.fd) \
tex(il2cmfib.fd) \
tex(il2cmfr.fd) \
tex(il2cmr.fd) \
tex(il2cmss.fd) \
tex(il2cmtt.fd) \
tex(il2cmvtt.fd) \
tex(il2enc.def) \
tex(il2lcmss.fd) \
tex(il2lcmtt.fd) \
tex(il2pag.fd) \
tex(il2pbk.fd) \
tex(il2pcr.fd) \
tex(il2phv.fd) \
tex(il2phvn.fd) \
tex(il2pnc.fd) \
tex(il2ppl.fd) \
tex(il2ptm.fd) \
tex(il2pzc.fd) \
tex(nhelvet.sty) \
tex(ntimes.sty) \
tex(slovak.sty) \
tex(xl2pag.fd) \
tex(xl2pbk.fd) \
tex(xl2pcr.fd) \
tex(xl2phv.fd) \
tex(xl2phvn.fd) \
tex(xl2pnc.fd) \
tex(xl2ppl.fd) \
tex(xl2ptm.fd) \
tex(xl2pzc.fd) \
texlive-cslatex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(czech.ldf) \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
tex(slovak.ldf) \
texlive \
texlive-atbegshi \
texlive-atveryend \
texlive-cm \
texlive-cslatex-bin \
texlive-csplain \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-fonts \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
