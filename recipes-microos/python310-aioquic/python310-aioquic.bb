SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.20"

RPM_NAME = "python310-aioquic-0.9.20-1.5.aarch64.rpm"
RPM_HASH = "8584ede60ed7cd8fb558b59c625cd94cfbc0d89b39fb2e1134538b224b7b7724781423f1f2ef8a02be52f5d6379d82508d5b8d6bc6ff57fd34ff6edc2516b21e"

RPROVIDES:${PN} += "python3-aioquic \
python3.10dist(aioquic) \
python310-aioquic \
python310-aioquic(aarch-64) \
python3dist(aioquic)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
python(abi) \
python310-certifi \
python310-cryptography \
python310-pyOpenSSL \
python310-pylsqpack"

inherit rpm
