SUMMARY = "OPL2/3 FM instrument loader"
DESCRIPTION = "sbiload is an OPL2/3 FM instrument loader for ALSA hwdep."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "sbiload-0.4.0-24.3.aarch64.rpm"
RPM_HASH = "510f565bcbca2d7447739fea6c1ec3e88482e55eb3eb8829256dd20e92c5c580e32a920a59858e5474071825b0bba3fc5e7c3ccff8524bd95b2365d61cba5210"

RPROVIDES:${PN} += "alsa-tools:/usr/bin/sbiload \
sbiload \
sbiload(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
