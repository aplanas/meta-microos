SUMMARY = "Pacemaker remote executor daemon for non-cluster nodes"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-remote package contains the Pacemaker Remote daemon \
which is capable of extending pacemaker functionality to remote \
nodes not running the full corosync/cluster stack."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-remote-2.1.5+20230320.22590c566-1.1.aarch64.rpm"
RPM_HASH = "26693e8640b3d8fc04c635e0f002d28ab136ec944ae12ac596c7eea080ed1c213d3aaf07688a932acac01eb79bc4ff820d6fdf2fa4f2cd3ed0bb74a495f01339"

RPROVIDES:${PN} += "pacemaker-remote pacemaker-remote(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrmcommon.so.34()(64bit) libcrmservice.so.28()(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) liblrmd.so.28()(64bit) libqb.so.100()(64bit) libstonithd.so.26()(64bit) pacemaker-cli pacemaker-libs resource-agents systemd"

inherit rpm
