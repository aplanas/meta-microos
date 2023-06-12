SUMMARY = "Run multiple jobs at once"
DESCRIPTION = "parallel [options] [command]-- [argument ...] \
 \
parallel runs the specified command, passing it a single one of the specified arguments. \
This is repeated for each argument. Jobs may be run in parallel. The default is to run one job per CPU."
LICENSE = "GPL-2.0-only"

PV = "0.67"

RPM_NAME = "moreutils-parallel-0.67-2.2.aarch64.rpm"
RPM_HASH = "8da469795555d98899089d638f954930d01d205928eb54a648201bfcc548faed15bc851cff7a90cf522b13ba6c23c8b864b1bb0d708ab1b1f530f0d5d39e57c5"

RPROVIDES:${PN} += "moreutils-parallel \
moreutils-parallel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
