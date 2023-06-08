SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
libpurple is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, IBM Sametime, and Zephyr. It can \
support many more with plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "b539ce42429f90d8e52770e9ad9aabd67b564e072590ec5e02ff24dcdeb636c2c461b0db84ea35f9b67b62b41a172bee5b86d0c2823b4191dae758a01c548532"

RPROVIDES:${PN} += "libbonjour.so()(64bit) libgg.so()(64bit) libirc.so()(64bit) libjabber.so.0()(64bit) libnovell.so()(64bit) libpurple libpurple(aarch-64) libsimple.so()(64bit) libxmpp.so()(64bit) libzephyr.so()(64bit) perl(Purple)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig /usr/bin/env ca-certificates-mozilla cyrus-sasl-digestmd5 cyrus-sasl-plain ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libavahi-glib.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgadu.so.3()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.4)(64bit) libperl.so()(64bit) libpurple-branding libpurple-client.so.0()(64bit) libpurple-client0 libpurple0 libsasl2.so.3()(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.4)(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.12.6)(64bit) libssl3.so(NSS_3.14)(64bit) libssl3.so(NSS_3.2)(64bit) libssl3.so(NSS_3.4)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) perl python3-dbus-python"

inherit rpm
