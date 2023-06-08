SUMMARY = "User-friendly integration of Asymptote into LaTeX"
DESCRIPTION = "The package is an unofficial alternative to the package \
provided with the Asymptote distribution, for including \
pictures within a LaTeX source file. While it does not \
duplicate all the features of the official package, this \
package is more user-friendly in several ways. Most notably, \
Asymptote errors are repackaged as LaTeX errors, making \
debugging less of a pain. It also has a more robust mechanism \
for identifying unchanged pictures that need not be recompiled."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn33490"

RPM_NAME = "texlive-asypictureb-2023.201.0.0.3svn33490-53.1.noarch.rpm"
RPM_HASH = "9af9fd447d68ac5f8678a4875fce28b708eb70b7106845938689ed14c036098054f18c50c72a1a28c107b8c7c8fa581ee6940a95079fc5cafaaf71c072df04fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(asypictureB.sty) texlive-asypictureb"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fancyvrb.sty) tex(graphicx.sty) tex(ifplatform.sty) tex(pgfkeys.sty) tex(verbatimcopy.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
