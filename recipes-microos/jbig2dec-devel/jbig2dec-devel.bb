SUMMARY = "JBIG2 decoder development files"
DESCRIPTION = "This package contains development files needed for developing applications \
based on libjbig2dec."
LICENSE = "AGPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "jbig2dec-devel-0.19-1.11.aarch64.rpm"
RPM_HASH = "abe7a5f47615679856d916dfa33ca18cd366093221bb68f881ca068a1c092cfbab966e178427f3d4ce12cfba8125197ee95a775e53fd6ecd91d37e086e88c8f8"

RPROVIDES:${PN} += "jbig2dec-devel \
jbig2dec-devel(aarch-64) \
pkgconfig(jbig2dec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjbig2dec0"

inherit rpm
