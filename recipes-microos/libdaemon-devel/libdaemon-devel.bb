SUMMARY = "Lightweight C library That Eases the Writing of UNIX Daemons"
DESCRIPTION = "libdaemon is a lightweight C library that eases the writing of UNIX \
daemons."
LICENSE = "GPL-2.0-or-later"

PV = "0.14"

RPM_NAME = "libdaemon-devel-0.14-19.7.aarch64.rpm"
RPM_HASH = "584570446f5a7c039f5d519d2e19bd146fe68b6493dfbe5da12acacfef75c528856851cfa1cdc8fc88172e001d94aded9c611983629dfbbf9da24d56ba49c1fa"

RPROVIDES:${PN} += "libdaemon-devel \
libdaemon-devel(aarch-64) \
pkgconfig(libdaemon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdaemon0"

inherit rpm
