SUMMARY = "Computer Modern Bright fonts"
DESCRIPTION = "A family of sans serif fonts for TeX and LaTeX, based on Donald \
Knuth's CM fonts. It comprises OT1, T1 and TS1 encoded text \
fonts of various shapes as well as all the fonts necessary for \
mathematical typesetting, including AMS symbols. This \
collection provides all the necessary files for using the fonts \
with LaTeX. A commercial-quality Adobe Type 1 version of these \
fonts is available from Micropress. Free versions are \
available, in the cm-super font bundle (the T1 and TS1 encoded \
part of the set), and in the hfbright package (the OT1 encoded \
part, and the maths fonts)."
LICENSE = "LPPL-1.0"

PV = "2023.201.8.1svn21107"

RPM_NAME = "texlive-cmbright-2023.201.8.1svn21107-53.1.noarch.rpm"
RPM_HASH = "2ad6486bea74c8183d4289cd07f45e3744f0cf2b23f5c4f88555bfa4ec4a38593af1a5744aafe64babf09e04da4d417868570c822fdf97344f97a8541fe93356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmbr10.tfm) \
tex(cmbr17.tfm) \
tex(cmbr8.tfm) \
tex(cmbr9.tfm) \
tex(cmbras10.tfm) \
tex(cmbras8.tfm) \
tex(cmbras9.tfm) \
tex(cmbrbs10.tfm) \
tex(cmbrbs8.tfm) \
tex(cmbrbs9.tfm) \
tex(cmbrbx10.tfm) \
tex(cmbright.sty) \
tex(cmbrmb10.tfm) \
tex(cmbrmi10.tfm) \
tex(cmbrmi8.tfm) \
tex(cmbrmi9.tfm) \
tex(cmbrsl10.tfm) \
tex(cmbrsl17.tfm) \
tex(cmbrsl8.tfm) \
tex(cmbrsl9.tfm) \
tex(cmbrsy10.tfm) \
tex(cmbrsy8.tfm) \
tex(cmbrsy9.tfm) \
tex(cmsltl10.tfm) \
tex(cmtl10.tfm) \
tex(ebbx10.tfm) \
tex(ebmo10.tfm) \
tex(ebmo17.tfm) \
tex(ebmo8.tfm) \
tex(ebmo9.tfm) \
tex(ebmr10.tfm) \
tex(ebmr17.tfm) \
tex(ebmr8.tfm) \
tex(ebmr9.tfm) \
tex(ebso10.tfm) \
tex(ebso17.tfm) \
tex(ebso8.tfm) \
tex(ebso9.tfm) \
tex(ebsr10.tfm) \
tex(ebsr17.tfm) \
tex(ebsr8.tfm) \
tex(ebsr9.tfm) \
tex(ebtl10.tfm) \
tex(ebto10.tfm) \
tex(omlcmbr.fd) \
tex(omlcmbrm.fd) \
tex(omscmbr.fd) \
tex(omscmbrs.fd) \
tex(ot1cmbr.fd) \
tex(ot1cmtl.fd) \
tex(t1cmbr.fd) \
tex(t1cmtl.fd) \
tex(tbbx10.tfm) \
tex(tbmo10.tfm) \
tex(tbmo17.tfm) \
tex(tbmo8.tfm) \
tex(tbmo9.tfm) \
tex(tbmr10.tfm) \
tex(tbmr17.tfm) \
tex(tbmr8.tfm) \
tex(tbmr9.tfm) \
tex(tbso10.tfm) \
tex(tbso17.tfm) \
tex(tbso8.tfm) \
tex(tbso9.tfm) \
tex(tbsr10.tfm) \
tex(tbsr17.tfm) \
tex(tbsr8.tfm) \
tex(tbsr9.tfm) \
tex(tbtl10.tfm) \
tex(tbto10.tfm) \
tex(ts1cmbr.fd) \
tex(ts1cmtl.fd) \
texlive-cmbright"
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
