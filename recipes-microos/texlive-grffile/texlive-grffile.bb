SUMMARY = "Extended file name support for graphics (legacy package)"
DESCRIPTION = "The original package extended the file name processing of \
package graphics to support a larger range of file names. The \
base LaTeX code now supports multiple dots and spaces, and this \
package by default is a stub that just loads graphicx. However, \
\\usepackage{grffile}[=v1] may be used to access version 1(.18) \
of the package if that is needed."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn52756"

RPM_NAME = "texlive-grffile-2023.201.2.1svn52756-53.1.noarch.rpm"
RPM_HASH = "3d140d9dd7244177189d8a31641106741adbc323c0c74468abb8bf514fc3866f498d12a8386bff2c2e9e9bb33a38aec70c0d7932529c8f9efc0d33f878643ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grffile-2017-06-30.sty) \
tex(grffile.sty) \
texlive-grffile"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphics.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
tex(ifxetex.sty) \
tex(kvoptions.sty) \
tex(pdftexcmds.sty) \
tex(stringenc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
