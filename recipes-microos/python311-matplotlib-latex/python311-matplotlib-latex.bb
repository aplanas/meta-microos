SUMMARY = "Allow rendering latex in python311-matplotlib"
DESCRIPTION = "This package allows python311-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-latex-3.6.3-2.1.noarch.rpm"
RPM_HASH = "d32e82973f28700dcab3c619f75d2ebff342863d98001d63754b4f7c898bb80c922bc5aa51256548f6884dd1ac7796de6731b768d6cc011cc77a046926950ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-matplotlib-latex"
RDEPENDS:${PN} += "python311-matplotlib \
tex(avant.sty) \
tex(chancery.sty) \
tex(charter.sty) \
tex(courier.sty) \
tex(geometry.sty) \
tex(helvet.sty) \
tex(mathpazo.sty) \
tex(mathptmx.sty) \
tex(pncr.tfm) \
tex(psfrag.sty) \
tex(type1cm.sty) \
tex(type1ec.sty) \
tex(ucs.sty) \
tex(underscore.sty) \
texlive-dvipng \
texlive-dvips \
texlive-geometry \
texlive-graphics \
texlive-helvetic \
texlive-latex \
texlive-pgf \
texlive-sfmath \
texlive-tex \
texlive-txfonts \
texlive-xcolor"

inherit rpm
