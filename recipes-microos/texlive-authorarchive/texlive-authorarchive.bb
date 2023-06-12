SUMMARY = "Adds self-archiving information to scientific papers"
DESCRIPTION = "This is a LaTeX style for producing author self-archiving \
copies of (academic) papers. The following layout-styles are \
pre-defined: ACMfor the two-column layout used by many ACM \
conferences IEEE for the two-column layout used by many IEEE \
conferences LNCS for the LNCS layout (as used by Springer) LNI \
for the Lecture Notes in Informatics, published by the GI ENTCS \
for the Elsevier ENTCS layout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.0svn65777"

RPM_NAME = "texlive-authorarchive-2023.201.1.3.0svn65777-53.1.noarch.rpm"
RPM_HASH = "9395052950ad1e1d78466466e3e30d63393892bc3777a4a89218075317c9d72b719a859b53e51471e1be9640ed68b58b5d4973182f45ef24e80d55f77df833fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(authorarchive.sty) \
texlive-authorarchive"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(enumitem.sty) \
tex(eso-pic.sty) \
tex(etoolbox.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(intopdf.sty) \
tex(kvoptions.sty) \
tex(lastpage.sty) \
tex(orcidlink.sty) \
tex(qrcode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
