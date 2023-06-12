SUMMARY = "GSM Base Station Controller"
DESCRIPTION = "This is the BSC-only version of OpenBSC. It requires a Mobile Switching Center \
(MSC) to operate. \
 \
You might rather prefer to use openbsc (osmo-nitb) which is considered a \
'GSM Network-in-a-Box' and does not depend on a MSC."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-bsc-sccplite-1.4.1-1.10.aarch64.rpm"
RPM_HASH = "4dff59910ec955bbdcebb130350df89c911576e5c96f071699bf1ab5e4a10aaebfaae06fe99a90c6baeca2f812654cc011829aa2c9bbc01716154d781c0c0059"

RPROVIDES:${PN} += "config(openbsc-bsc-sccplite) \
openbsc-bsc-sccplite \
openbsc-bsc-sccplite(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
libosmocore.so.20()(64bit) \
libosmonetif.so.11()(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
