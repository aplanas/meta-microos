SUMMARY = "Extend the standard classes' size options"
DESCRIPTION = "Provides classes extarticle, extreport, extletter, extbook and \
extproc which provide for documents with a base font size from \
8-20pt. There is also a LaTeX package, extsizes.sty, which can \
be used with nonstandard document classes. But it cannot be \
guaranteed to work with any given class."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4asvn17263"

RPM_NAME = "texlive-extsizes-2023.201.1.4asvn17263-52.1.noarch.rpm"
RPM_HASH = "d803b31326c0ad2830c2e873ed933c4a5c8c800ea6c986dd3e3e80591c607efe9acd855e7382433c51130f90b7704d86d5c91308ba5afad15f36c428d736b93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(autopagewidth.sty) tex(extarticle.cls) tex(extbook.cls) tex(extletter.cls) tex(extproc.cls) tex(extreport.cls) tex(extsizes.sty) tex(size14.clo) tex(size17.clo) tex(size20.clo) tex(size8.clo) tex(size9.clo) texlive-extsizes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(exscale.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
