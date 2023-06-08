SUMMARY = "OpenConnect VPN Server"
DESCRIPTION = "OpenConnect server (ocserv) is an SSL VPN server. Its purpose is to \
be a secure, small, fast and configurable VPN server. It implements \
the OpenConnect SSL VPN protocol, and has also (currently experimental) \
compatibility with clients using the AnyConnect SSL VPN protocol. \
The OpenConnect protocol provides a dual TCP/UDP VPN channel, and \
uses the standard IETF security protocols to secure it. The server \
is implemented primarily for the GNU/Linux platform but its code \
is designed to be portable to other UNIX variants as well. \
 \
Ocserv's main features are security through privilege separation \
and sandboxing, accounting, and resilience due to a combined use \
of TCP and UDP. Authentication occurs in an isolated security \
module process, and each user is assigned an unprivileged worker \
process, and a networking (tun) device. That not only eases the \
control of the resources of each user or group of users, but also \
prevents data leak (e.g., heartbleed-style attacks), and privilege \
escalation due to any bug on the VPN handling (worker) process. \
A management interface allows for viewing and querying logged-in users."
LICENSE = "GPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "ocserv-1.1.6-2.3.aarch64.rpm"
RPM_HASH = "ae17cd0b46498d3c980655d8b4392cb6159e0e8fc403469085b110ac28d024d0f0a18c03b2493e401ea607c660827ad8187bcf13d83795d334bb8a6459b7e3a0"

RPROVIDES:${PN} += "config(ocserv) ocserv ocserv(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh gnutls ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libev.so.4()(64bit) libfreeradius-client.so.2()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_0)(64bit) liblz4.so.1()(64bit) libmaxminddb.so.0()(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-route-3.so.200()(64bit) libnl-route-3.so.200(libnl_3)(64bit) liboath.so.0()(64bit) liboath.so.0(LIBOATH_1.2.0)(64bit) liboath.so.0(LIBOATH_1.8.0)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libreadline.so.8()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) systemd"

inherit rpm
