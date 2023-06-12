SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "The OpenSSL Project is a collaborative effort to develop a robust, \
commercial-grade, full-featured, and open source toolkit implementing \
the Secure Sockets Layer (SSL v2/v3) and Transport Layer Security (TLS \
v1) protocols with full-strength cryptography. The project is managed \
by a worldwide community of volunteers that use the Internet to \
communicate, plan, and develop the OpenSSL toolkit and its related \
documentation."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3.1.1-1.1.noarch.rpm"
RPM_HASH = "8162722e78c9a7787937f52fbbd232907e411d2a95e1d5516d251abdf2069d1bf8c19a8613320f8f37a9b02a7e2291881f7de1a7038437c3f1caf9973b2a2b66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl openssl(cli)"
RDEPENDS:${PN} += "openssl-3"

inherit rpm
