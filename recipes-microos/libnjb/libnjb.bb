SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb-2.2.7-111.12.aarch64.rpm"
RPM_HASH = "2d805140b5532b7a0c66bf699b695a30a92f6a23f70f9b35790ba6c8c31389dd18aebd510c9abda1d4c70533e768aa1140ef4e3f5554b8a67e3d0ae258ad8602"

RPROVIDES:${PN} += "libnjb libnjb(aarch-64)"
RDEPENDS:${PN} += "dbus-1 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnjb.so.5()(64bit) libz.so.1()(64bit)"

inherit rpm
