SUMMARY = "LaTeX support of pastors' and priests' work"
DESCRIPTION = "In 'Die TeXnische Komodie' (issue 1/2013) Christian Justen \
described his use of LaTeX in his work as priest (similar \
requirements may be encountered in the work of pastors and \
other ministers of religion). One point was to arrange A5 pages \
onto A4 landscape paper, either side-by-side or as a booklet. \
Justen made two bash scripts for this job; the package provides \
one texlua script for both requirements. (Note that file \
a5toa4.tlu should have execute permissions in any \
installation.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.r36svn31934"

RPM_NAME = "texlive-pfarrei-2023.201.r36svn31934-51.1.noarch.rpm"
RPM_HASH = "5eca0ee1936f9916519ade006a181c182c11c0fd88f828e4c29e48e3524bf4c2c6f631a9b044fab9d5337613f59e26d088360c9fedc2d2b35704391ce8b1e3d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(a5toa4.tex) \
tex(pfarrei.sty) \
texlive-pfarrei"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifpdf.sty) \
tex(keyval.sty) \
tex(pdfpages.sty) \
tex(x.tex) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pfarrei-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
