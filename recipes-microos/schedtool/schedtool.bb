SUMMARY = "Query and set CPU scheduling parameters"
DESCRIPTION = "schedtool can set all CPU scheduling parameters Linux is capable \
of or display information for given processes."
LICENSE = "GPL-2.0"

PV = "1.3.0"

RPM_NAME = "schedtool-1.3.0-14.30.aarch64.rpm"
RPM_HASH = "71ef202b3130b6937124804d82144fdfebca7f36b1beaae7e0d710ba750f085cc7bebc0a7300e065edd2ea396b15a10d412a49ff2702fc58f9797bc76c60747a"

RPROVIDES:${PN} += "schedtool schedtool(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
