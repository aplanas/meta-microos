SUMMARY = "VDE history library"
DESCRIPTION = "This package contains VDE history library \
A library to manage history and command completion for vde mgmt protocol"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdehist0-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "4537d5dc05edff1d98fcd94db0cd0cbb00223fc60c6eba49c00b552a96268fb4998479db5fd97792af949c1b02e612508aa618d8d3b243689203ef6e8e20bb3e"

RPROVIDES:${PN} += "libvdehist.so.0()(64bit) \
libvdehist0 \
libvdehist0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
