SUMMARY = "NIS client daemon"
DESCRIPTION = "This package provides the ypbind daemon. The ypbind daemon binds NIS \
clients to an NIS domain and searches a new NIS server if the old one \
goes down. \
 \
Ypbind must be running on any machines which are running NIS client \
programs."
LICENSE = "GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "ypbind-2.7.2-2.11.aarch64.rpm"
RPM_HASH = "27454365e607bd194db392f9b5b34746640799b1f7307e06091a4806365cd54ec681871deae58815f81ed55f7d7f72ad08aebadf738891041b2c07a4bd8b2d2c"

RPROVIDES:${PN} += "config(ypbind) ypbind ypbind(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/grep ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnsl.so.3()(64bit) libnsl.so.3(LIBNSL_2.0)(64bit) libnss_nis2 libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) rpcbind yp-tools"

inherit rpm
