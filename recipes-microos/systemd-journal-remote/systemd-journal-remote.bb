SUMMARY = "Gateway for serving journal events over the network using HTTP"
DESCRIPTION = "This extends the journal functionality to keep a copy of logs on a \
remote server by providing programs to forward journal entries over \
the network, using encrypted HTTP, and to write journal files from \
serialized journal contents. \
 \
This package contains systemd-journal-gatewayd, \
systemd-journal-remote, and systemd-journal-upload."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-journal-remote-253.4-1.2.aarch64.rpm"
RPM_HASH = "f9724962392b007d600ce805519536e130fb16c27a5ec0d7a8ae0474639ad7383d2b906d483e22f2bbe405c8e96a561c361c70440c763e5f58b396fa8a5b22f4"

RPROVIDES:${PN} += "config(systemd-journal-remote) systemd-journal-remote systemd-journal-remote(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libmicrohttpd.so.12()(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) systemd"

inherit rpm
