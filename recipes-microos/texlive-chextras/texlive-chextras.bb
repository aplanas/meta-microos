SUMMARY = "A companion package for the Swiss typesetter"
DESCRIPTION = "The package simplifies the preparation of Swiss documents and \
letters by setting up linguistic and common packages. While it \
is a useful addition to the chletter document class, it is not \
tied to it and may be used as a general purpose package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn27118"

RPM_NAME = "texlive-chextras-2023.201.1.01svn27118-53.1.noarch.rpm"
RPM_HASH = "32157ffff86a0a98b8d0b444125246b720abc130504921fc51fc88f9bb01df3394fdf31017f1d87b85978224a14925db418dd240da9d74ad5677494855cf5c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chextras.sty) tex(eu1lmros.fd) tex(eu1lmssos.fd) tex(eu1lmttos.fd) tex(eu1lmvttos.fd) tex(t1lmros.fd) tex(t1lmssos.fd) tex(t1lmttos.fd) tex(t1lmvttos.fd) texlive-chextras"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(etoolbox.sty) tex(fixltx2e.sty) tex(fontenc.sty) tex(hyperref.sty) tex(inputenc.sty) tex(lmodern.sty) tex(luainputenc.sty) tex(makecmds.sty) tex(xkeyval.sty) tex(xunicode.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
