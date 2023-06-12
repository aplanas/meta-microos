SUMMARY = "Plotting dart boards"
DESCRIPTION = "pst-dart is a PSTricks related package and draws Dart Boards. \
Optional arguments are the unit and the fontsize."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn60476"

RPM_NAME = "texlive-pst-dart-2023.201.0.0.03svn60476-52.1.noarch.rpm"
RPM_HASH = "2953fa9cc0b2f797cb69c41ae9cd26a2e3434be45ac724f03a249d182aab3fefdb72f34f868d0515150eff970289c29602735104917c8e1135065d40989b94ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-dart.sty) \
tex(pst-dart.tex) \
texlive-pst-dart"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(multido.sty) \
tex(pst-xkey.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
