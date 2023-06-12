SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "python311-miniupnpc-2.2.4-1.4.aarch64.rpm"
RPM_HASH = "90bad9850468203c5876843692630a4cdd999d0e4fb3d2d87ea5225f5284769ba286bd8e4958fd68368c37022407a5a00d9bf463e17945b0fb74196c3575abf6"

RPROVIDES:${PN} += "python3.11dist(miniupnpc) \
python311-miniupnpc \
python311-miniupnpc(aarch-64) \
python3dist(miniupnpc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libminiupnpc17 \
python(abi)"

inherit rpm
