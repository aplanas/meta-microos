SUMMARY = "Font containing a set of web-related icons"
DESCRIPTION = "This package grants access to 336 web-related icons provided by \
the included 'Typicons' free font, designed by Stephen \
Hutchings and released under the SIL Open Font License. See \
http://www.typicons.com for more details about the font itself. \
This package requires the fontspec package and either the \
Xe(La)TeX or Lua(La)TeX engine to load the included ttf font. \
Once the package is loaded, icons can be accessed through the \
general \\ticon command, which takes as argument the name of the \
desired icon, or through direct commands specific to each icon. \
The full list of icon designs, names and direct commands is \
showcased in the manual."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn37623"

RPM_NAME = "texlive-typicons-2023.201.2.0.7svn37623-52.1.noarch.rpm"
RPM_HASH = "021e46622ede1045bbf65a868c89f1635b66b906ac075c2e84522743057d7091504c38e746f544b4db55ce84ccc5d2150b6327f7399e32ef021630a00948edb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(typicons.sty) \
texlive-typicons"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-typicons-fonts"

inherit rpm
