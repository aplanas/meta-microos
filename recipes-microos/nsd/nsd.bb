SUMMARY = "An authoritative-only domain name server"
DESCRIPTION = "NSD is a complete implementation of an authoritative domain name server, developed \
by NLnet Labs, with the purpose of creating more diversity in the DNS landscape."
LICENSE = "BSD-3-Clause"

PV = "4.6.1"

RPM_NAME = "nsd-4.6.1-1.4.aarch64.rpm"
RPM_HASH = "da25ef848d06c46e4004d39e46782179dec8a3acc99a14920d164b1167afa0e7630b654a0dc1c03ff0297f89936c0e24cdff9c38095a89c4e97389dd3348c1d8"

RPROVIDES:${PN} += "config(nsd) \
nsd \
nsd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
findutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libevent-2.1.so.7()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
pwdutils \
shadow \
systemd"

inherit rpm
