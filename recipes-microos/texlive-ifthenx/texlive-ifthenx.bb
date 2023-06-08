SUMMARY = "Extra tests for \\ifthenelse"
DESCRIPTION = "The package extends the ifthen package, providing extra \
predicates for the package's \\ifthenelse command. The package \
is complementary to xifthen, in that they provide different \
facilities; the two may be loaded in the same document, as long \
as xifthen is loaded first."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-2023.201.0.0.1asvn25819-52.1.noarch.rpm"
RPM_HASH = "1140bedf693b57d04f326b71fc4980b422d856ccb537171b3647cb399b55bb18a3ebc67903b7c82e4dcb003e7a15ac5de55741a992108e7f35cee239dc124adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ifthenx.sty) texlive-ifthenx"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
