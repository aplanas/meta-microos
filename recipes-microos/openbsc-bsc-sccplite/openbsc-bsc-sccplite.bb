SUMMARY = "GSM Base Station Controller"
DESCRIPTION = "This is the BSC-only version of OpenBSC. It requires a Mobile Switching Center \
(MSC) to operate. \
 \
You might rather prefer to use openbsc (osmo-nitb) which is considered a \
'GSM Network-in-a-Box' and does not depend on a MSC."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-bsc-sccplite-1.4.1-1.9.aarch64.rpm"
RPM_HASH = "cf2f97dbf25648c3103f7bfc0b1d5811d61c2e14c24125e6a8baadae3ecbdb15df070adb5ee54f5a943176b2d3d926a724dce8efa0a3814273a34fda920e7920"

RPROVIDES:${PN} += "config(openbsc-bsc-sccplite) openbsc-bsc-sccplite openbsc-bsc-sccplite(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libosmocore.so.19()(64bit) libosmonetif.so.8()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
