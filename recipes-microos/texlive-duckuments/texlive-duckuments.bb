SUMMARY = "Create duckified dummy content"
DESCRIPTION = "The package provides facilities to create duckified dummy \
contents. It was inspired by the question 'Getting ducks in \
example images' on TeX-LaTeX Stack Exchange. The following \
macros are available: \\duckument[key=val] - print a short \
duckument \\blindduck[key=val] - print a paragraph \
\\ducklist(*){environment} - create a list of type environment \
\\ducklistlist(*){environment} - create nested lists \
\\duckitemize - ducklist{itemize} \\duckenumerate - \
ducklist{enumerate} \\duckdescription - ducklist{description} \
\\duckumentsCreateExampleFile \\duckumentsDrawRandomDucks The \
package works with pdfTeX, LuaTeX, and XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn52271"

RPM_NAME = "texlive-duckuments-2023.201.0.0.5svn52271-52.1.noarch.rpm"
RPM_HASH = "b380f9dfd7b3e3fc4db48609f63114284c831406234498104ed869cec4ce9eef3ba20363f1c0d20bf43b85984c92fe8b0e9eb839f6acc69e954bcbed2285b171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(duckuments.sty) \
texlive-duckuments"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(l3keys2e.sty) \
tex(letltxmacro.sty) \
tex(tikzducks.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
