SUMMARY = "Writing specifications such as for UP-based methodologies"
DESCRIPTION = "The bundle allows the user to create Unified Process \
methodology (UP or RUP) based documents. The style provides \
document versioning, document history, document authors, \
document validators, specification description, task \
management, and several helping macros."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.20221004svn64613"

RPM_NAME = "texlive-upmethodology-2023.201.20221004svn64613-53.1.noarch.rpm"
RPM_HASH = "cf79b6bdce9f11107e922d24962154037980e82aa667d029c90989425464c7d0fc390e63034faece51a803966c848280aacefb2cf883beb2c9c47129e9cc8ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(UPMVERSION.def) tex(upmethodology-backpage.sty) tex(upmethodology-code.sty) tex(upmethodology-document.cls) tex(upmethodology-document.sty) tex(upmethodology-extension.sty) tex(upmethodology-fmt.sty) tex(upmethodology-frontpage.sty) tex(upmethodology-p-common.sty) tex(upmethodology-spec.sty) tex(upmethodology-task.sty) tex(upmethodology-version.sty) texlive-upmethodology"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(a4wide.sty) tex(amsmath.sty) tex(amsthm.sty) tex(babel.sty) tex(bbm.sty) tex(colortbl.sty) tex(draftwatermark.sty) tex(environ.sty) tex(graphicx.sty) tex(hyphenat.sty) tex(ifpdf.sty) tex(ifthen.sty) tex(multicol.sty) tex(picinpar.sty) tex(pifont.sty) tex(relsize.sty) tex(setspace.sty) tex(subcaption.sty) tex(tabularx.sty) tex(thmtools.sty) tex(txfonts.sty) tex(ulem.sty) tex(url.sty) tex(varioref.sty) tex(vmargin.sty) tex(xcolor.sty) tex(xkeyval.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
