SUMMARY = "RSS Feed Reader"
DESCRIPTION = "RSSTail is more or less an RSS reader: it monitors an RSS feed and if it \
detects a new entry, it will emit only that new entry."
LICENSE = "GPL-2.0"

PV = "2.1"

RPM_NAME = "rsstail-2.1-1.23.aarch64.rpm"
RPM_HASH = "e500aa1e92cdd551b84eabfac04c1417ad0eb48c61f72f3f1303ad40d91e0814ef5f1c629cc5230a01e67fe3fece493933c5ddbe6857cbc084cfd49ae3502c8d"

RPROVIDES:${PN} += "rsstail \
rsstail(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmrss.so.0()(64bit)"

inherit rpm
