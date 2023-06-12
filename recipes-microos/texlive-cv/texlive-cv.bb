SUMMARY = "A package for creating a curriculum vitae"
DESCRIPTION = "The package is distributed with two example files; they (and \
their formatted output) constitute the only real documentation. \
Note that cv is just a package: you choose the overall \
formatting by deciding which class to use, while the package \
provides the detailed formatting."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-cv-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "bbfe59e7853515ecca4b22ae22422ce85e208f724873cd38a25288ccd7a89b7cc460b7538d7c3789bab10c8f95a9b55a8423d50365d6acf8a731341464302a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(CV.sty) \
texlive-cv"
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
