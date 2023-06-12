SUMMARY = "Three dimensional objects using PSTricks"
DESCRIPTION = "The package uses PSTricks to provide basic three-dimensional \
objects. As yet, only cubes (which can be deformed to \
rectangular parallelipipeds) and dies (which are only a special \
kind of cubes) are defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.22svn54514"

RPM_NAME = "texlive-pst-ob3d-2023.201.0.0.22svn54514-52.1.noarch.rpm"
RPM_HASH = "71120df522b28281e0078d1997bbf8d5a6a3f64e4d8a7a8519dd61c421fd50252aa89e346cfa2933cf40664553e961b602b764d39713f4ff8cc8a680120cb444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-ob3d.sty) \
tex(pst-ob3d.tex) \
texlive-pst-ob3d"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
