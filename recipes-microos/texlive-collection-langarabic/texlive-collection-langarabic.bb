SUMMARY = "Arabic"
DESCRIPTION = "Support for Arabic and Persian."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59594"

RPM_NAME = "texlive-collection-langarabic-2023.201.svn59594-56.1.noarch.rpm"
RPM_HASH = "3f206bb9b5acab718e2c7a083201cd3e0a0b17b57d52bf7a60b4d3871ad525374717ab5847489660e1eaed5c15790a6b0a224c5a38a790304a614df884fc24a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langarabic"
RDEPENDS:${PN} += "texlive-alkalami texlive-alpha-persian texlive-amiri texlive-arabi texlive-arabi-add texlive-arabic-book texlive-arabluatex texlive-arabtex texlive-bidi texlive-bidihl texlive-collection-basic texlive-dad texlive-ghab texlive-hvarabic texlive-hyphen-arabic texlive-hyphen-farsi texlive-imsproc texlive-kurdishlipsum texlive-lshort-persian texlive-luabidi texlive-na-box texlive-persian-bib texlive-quran texlive-sexam texlive-simurgh texlive-texnegar texlive-tram texlive-xepersian texlive-xepersian-hm"

inherit rpm
