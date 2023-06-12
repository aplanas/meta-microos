SUMMARY = "Arabic"
DESCRIPTION = "Support for Arabic and Persian."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59594"

RPM_NAME = "texlive-collection-langarabic-2023.208.svn59594-58.1.noarch.rpm"
RPM_HASH = "7a8bf81da21668590452b64a896b45a6ce24ff850d448a7fa28c6ecedd88ce086e5b669aa228e30357059be0ae89456fcdf24f81d6d43ceb80cc8795e39803a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langarabic"
RDEPENDS:${PN} += "texlive-alkalami \
texlive-alpha-persian \
texlive-amiri \
texlive-arabi \
texlive-arabi-add \
texlive-arabic-book \
texlive-arabluatex \
texlive-arabtex \
texlive-bidi \
texlive-bidihl \
texlive-collection-basic \
texlive-dad \
texlive-ghab \
texlive-hvarabic \
texlive-hyphen-arabic \
texlive-hyphen-farsi \
texlive-imsproc \
texlive-kurdishlipsum \
texlive-lshort-persian \
texlive-luabidi \
texlive-na-box \
texlive-persian-bib \
texlive-quran \
texlive-sexam \
texlive-simurgh \
texlive-texnegar \
texlive-tram \
texlive-xepersian \
texlive-xepersian-hm"

inherit rpm
