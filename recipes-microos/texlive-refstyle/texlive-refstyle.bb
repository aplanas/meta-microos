SUMMARY = "Advanced formatting of cross references"
DESCRIPTION = "The package provides a consistent way of producing references \
throughout a project. Enough flexibility is provided to make \
local changes to a single reference. The user can configure \
their own setup. The package offers a direct interface to \
varioref (for use, for example, in large projects such as a \
series of books, or a multivolume thesis written as a series of \
documents), and name references from the nameref package may be \
incorporated with ease. For large projects such as a series of \
books or a multi volume thesis, written as freestanding \
documents, a facility is provided to interface to the xr \
package for external document references."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn20318"

RPM_NAME = "texlive-refstyle-2023.201.0.0.5svn20318-53.1.noarch.rpm"
RPM_HASH = "797342148e706f979dc1b6bfbe36681134af811062c6328a1754eb57aa57e284f5acb05ac69ff593a5087dd5e00bc41663ed9309c55ed0614864b4a3f4cd3ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(refstyle.cfg) tex(refstyle.sty) texlive-refstyle"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
