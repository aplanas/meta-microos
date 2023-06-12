SUMMARY = "Define maths 'ligatures'"
DESCRIPTION = "The package defines character sequences that 'behave like' \
ligatures, in maths mode. Example definitions (chosen to show \
the package's flexibility, are: \\mathlig{->}{\\rightarrow} \
\\mathlig{<-}{\\leftarrow} \\mathlig{<->}{\\leftrightarrow}"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54244"

RPM_NAME = "texlive-mathlig-2023.201.1.0svn54244-52.1.noarch.rpm"
RPM_HASH = "ef27873c37fe6124215535cfe543e4133e80620c0eb364c2f340755b81ecab08d534c08fcdebd21e9b52ea5a1dfe526b6a32c569abc83832b01fdcd463523a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathlig.tex) \
texlive-mathlig"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
