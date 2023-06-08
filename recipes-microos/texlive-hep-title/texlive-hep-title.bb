SUMMARY = "Extensions for the title page"
DESCRIPTION = "The hep-title package extends the title macros of the standard \
classes with macros for a preprint, affiliation, editors, and \
endorsers. The package is loaded with \\usepackage{hep-title}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64907"

RPM_NAME = "texlive-hep-title-2023.201.1.1svn64907-53.1.noarch.rpm"
RPM_HASH = "c0c37dd9e0c768bcefe5b3af5c20e355e452882a8e459078ce90410e50e1d27ce0d9984e97c66d24dfedffd7099bbe694772d1aa6f1c84195f682b5a64d8eb57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hep-title.sty) texlive-hep-title"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(abstract.sty) tex(atbegshi.sty) tex(authblk.sty) tex(calc.sty) tex(environ.sty) tex(picture.sty) tex(titling.sty) tex(varwidth.sty) tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
