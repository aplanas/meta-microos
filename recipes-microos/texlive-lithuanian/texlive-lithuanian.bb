SUMMARY = "Lithuanian language support"
DESCRIPTION = "This language support package provides extra 8-bit encoding \
L7x used by fontenc: l7xenc.def, l7xenc.dfu, l7xenc.sty \
Lithuanian TeX support for URW family Type1 fonts: map, fd, tfm \
with L7x encoding extra code page definitions used by inputenc: \
cp775.def, latin7.def"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66461"

RPM_NAME = "texlive-lithuanian-2023.201.svn66461-54.1.noarch.rpm"
RPM_HASH = "688e42d3155551f3b51ba96b856c76c1f1da9f4c766de04bb1f7e09dd73aad5e38678acd4440ef48e4bf5a08d206e6e2921926e9a5f2057eb71d7ecaad386ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cp775.def) tex(l7x-uagd.tfm) tex(l7x-uagdo.tfm) tex(l7x-uagk.tfm) tex(l7x-uagko.tfm) tex(l7x-ubkd.tfm) tex(l7x-ubkdi.tfm) tex(l7x-ubkl.tfm) tex(l7x-ubkli.tfm) tex(l7x-ucrb.tfm) tex(l7x-ucrbo.tfm) tex(l7x-ucrr.tfm) tex(l7x-ucrro.tfm) tex(l7x-uhvb.tfm) tex(l7x-uhvbc.tfm) tex(l7x-uhvbo.tfm) tex(l7x-uhvboc.tfm) tex(l7x-uhvr.tfm) tex(l7x-uhvrc.tfm) tex(l7x-uhvro.tfm) tex(l7x-uhvroc.tfm) tex(l7x-uncb.tfm) tex(l7x-uncbi.tfm) tex(l7x-uncr.tfm) tex(l7x-uncri.tfm) tex(l7x-uplb.tfm) tex(l7x-uplbi.tfm) tex(l7x-uplr.tfm) tex(l7x-uplri.tfm) tex(l7x-urwvn.map) tex(l7x-utmb.tfm) tex(l7x-utmbi.tfm) tex(l7x-utmr.tfm) tex(l7x-utmri.tfm) tex(l7x-uzcmi.tfm) tex(l7xenc.def) tex(l7xenc.sty) tex(l7xuag.fd) tex(l7xubk.fd) tex(l7xucr.fd) tex(l7xuhv.fd) tex(l7xunc.fd) tex(l7xupl.fd) tex(l7xutm.fd) tex(l7xuzc.fd) tex(latin7.def) tex(latin7x.enc) texlive-lithuanian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
