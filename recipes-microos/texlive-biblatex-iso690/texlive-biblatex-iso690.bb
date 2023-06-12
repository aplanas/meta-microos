SUMMARY = "BibLaTeX style for ISO 690 standard"
DESCRIPTION = "The package provides a bibliography and citation style which \
conforms to the latest revision of the international standard \
ISO 690:2010. The implementation follows BibLaTeX conventions \
and requires BibLaTeX [?] 3.4 and biber [?] 2.5."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn62866"

RPM_NAME = "texlive-biblatex-iso690-2023.201.0.0.4.1svn62866-53.1.noarch.rpm"
RPM_HASH = "c8b789e55c8ca7c1749738dcf5facdfa522de1a21025663042546fafd421f6901b9bb807a9d9b3b2a55f7706e6bc2f9007a7b64067feaef41580b8ebaee210e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bulgarian-iso.lbx) \
tex(czech-iso.lbx) \
tex(english-iso.lbx) \
tex(french-iso.lbx) \
tex(german-iso.lbx) \
tex(iso-alphabetic.bbx) \
tex(iso-alphabetic.cbx) \
tex(iso-authortitle.bbx) \
tex(iso-authortitle.cbx) \
tex(iso-authoryear.bbx) \
tex(iso-authoryear.cbx) \
tex(iso-fullcite.cbx) \
tex(iso-numeric.bbx) \
tex(iso-numeric.cbx) \
tex(iso.bbx) \
tex(ngerman-iso.lbx) \
tex(polish-iso.lbx) \
tex(slovak-iso.lbx) \
tex(spanish-iso.lbx) \
texlive-biblatex-iso690"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphabetic.cbx) \
tex(authortitle.cbx) \
tex(authoryear.cbx) \
tex(bulgarian.lbx) \
tex(czech.lbx) \
tex(english.lbx) \
tex(french.lbx) \
tex(german.lbx) \
tex(ngerman.lbx) \
tex(numeric.cbx) \
tex(polish.lbx) \
tex(slovak.lbx) \
tex(spanish.lbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
