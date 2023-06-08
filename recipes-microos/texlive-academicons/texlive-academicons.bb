SUMMARY = "Font containing high quality icons of online academic profiles"
DESCRIPTION = "The academicons package provides access in (La)TeX to 124 high \
quality icons of online academic profiles included in the free \
'Academicons' font. This package requires either the Xe(La)TeX \
or Lua(La)TeX engine to load the 'Academicons' font from the \
system, which requires installing the bundled academicons.ttf \
font file. As new releases come out, it is recommended to \
install the bundled font version as there may be differences \
between the package and previous font versions or newest font \
versions not yet contemplated in the package. The 'Academicons' \
font was designed by James Walsh and released (see \
http://jpswalsh.github.io/academicons/) under the open SIL Open \
Font License. This package is a redistribution of the free \
'Academicons' font with specific bindings for (La)TeX. It is \
inspired and based on the fontawesome package. The academicons \
package provides the generic \\aiicon command to access icons, \
which takes as mandatory argument the name of the desired icon. \
It also provides individual direct commands for each specific \
icon. The full list of icons and their respective names and \
direct commands can be found in the manual. For example, \
\\aiicon{googlescholar} yields the same result as \
\\aiGoogleScholar."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.1_2svn62622"

RPM_NAME = "texlive-academicons-2023.201.1.9.1_2svn62622-54.1.noarch.rpm"
RPM_HASH = "a553e9104f9cd5c29412a8238608598e22e62e1a516df585a6df885bd58d34a82f8fbd7fa5367f198ab6af7c86f525267de18315875d5aeecd57218af1ad003a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(academicons.sty) tex(tuacademicons.fd) texlive-academicons"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-academicons-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
