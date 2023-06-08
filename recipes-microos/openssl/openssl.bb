SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "The OpenSSL Project is a collaborative effort to develop a robust, \
commercial-grade, full-featured, and open source toolkit implementing \
the Secure Sockets Layer (SSL v2/v3) and Transport Layer Security (TLS \
v1) protocols with full-strength cryptography. The project is managed \
by a worldwide community of volunteers that use the Internet to \
communicate, plan, and develop the OpenSSL toolkit and its related \
documentation."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "openssl-3.0.8-1.3.noarch.rpm"
RPM_HASH = "3786064c109fcbcd46699502bd07d41bc51ac304497b6b48d858f95faa3b7a7ed0f5dd2d84b35158afd9557cf1d1c22d9f27d1cf91b3b4193af9d2aa94b6a724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl openssl(cli)"
RDEPENDS:${PN} += "openssl-3"

inherit rpm
