SUMMARY = "An authoritative DNS daemon"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "knot-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "91727ee54d41082cf77aac9823e9264a0186ae1ad8e049a47e95c6a29bcc3223dfc6f907da7ab1922703c8c36bc6282edfb92896e273698df424d190cf546ecc"

RPROVIDES:${PN} += "config(knot) group(knot) knot knot(aarch-64) user(knot)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit) libdnssec.so.9()(64bit) libedit.so.0()(64bit) libfstrm.so.0()(64bit) libfstrm.so.0(LIBFSTRM_0.2.0)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) libknot.so.13()(64bit) liblmdb-0.9.30.so()(64bit) libmaxminddb.so.0()(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) liburcu.so.8()(64bit) libzscanner.so.4()(64bit) systemd sysuser-shadow"

inherit rpm
