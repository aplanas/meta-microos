SUMMARY = "Provides a scaled Courier font"
DESCRIPTION = "This package sets the default typewriter font to Courier with a \
possible scale factor (in the same way as the helvet package \
for Helvetica works for sans serif)."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn24940"

RPM_NAME = "texlive-courier-scaled-2023.204.svn24940-54.1.noarch.rpm"
RPM_HASH = "29bcba3475b83a106a3119912a139d01519cd114299f5c739afb86e787225d9a2d4d92eb8b7933837480bd3b49ee7431660fca51e5e78fb305906db3daa7f460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(8rpcrs.fd) tex(couriers.sty) tex(il2pcrs.fd) tex(ly1pcrs.fd) tex(omlpcrs.fd) tex(omspcrs.fd) tex(ot1pcrs.fd) tex(t1pcrs.fd) tex(t5pcrs.fd) tex(ts1pcrs.fd) tex(xl2pcrs.fd) texlive-courier-scaled"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
