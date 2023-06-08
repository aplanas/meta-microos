SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "python310-miniupnpc-2.2.4-1.4.aarch64.rpm"
RPM_HASH = "12f2fceeae2808aefd623213b07c391b2ae023b7e8fb4c03a2e10ef0ae96444bf497d338da577852b2f5c273a2b5f6b71877accf2276526258c6bbbf30639616"

RPROVIDES:${PN} += "python3-miniupnpc python3.10dist(miniupnpc) python310-miniupnpc python310-miniupnpc(aarch-64) python3dist(miniupnpc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libminiupnpc17 python(abi)"

inherit rpm
