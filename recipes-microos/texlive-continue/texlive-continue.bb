SUMMARY = "Prints 'continuation' marks on pages of multipage documents"
DESCRIPTION = "This package provides for a variety of continuation indicators \
on pages when the text continues on the following page. The \
default is to only mark odd pages, but all pages can be marked \
and the marking can be stopped or started at any point."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2svn49449"

RPM_NAME = "texlive-continue-2023.204.0.0.2svn49449-54.1.noarch.rpm"
RPM_HASH = "5c3eb91eda3c4e5e72540245fa9832065e133dfc18be15d8a5d73561e827594e27628afee0950b7bca6b3d105660bdf03d8c4fa9883739aed18baf6d4bb53924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(continue.sty) \
texlive-continue"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(picture.sty) \
tex(zref-abspage.sty) \
tex(zref-lastpage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
