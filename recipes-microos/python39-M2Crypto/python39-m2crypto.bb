SUMMARY = "Crypto and SSL toolkit for Python"
DESCRIPTION = "M2Crypto is a crypto and SSL toolkit for Python featuring the following: \
 \
RSA, DSA, DH, HMACs, message digests, symmetric ciphers (including \
AES). SSL functionality to implement clients and servers. HTTPS \
extensions to Python's httplib, urllib, and xmlrpclib. Unforgeable \
HMAC'ing AuthCookies for web session management. FTP/TLS client and \
server. S/MIME. ZServerSSL: A HTTPS server for Zope. ZSmime: An S/MIME \
messenger for Zope."
LICENSE = "MIT"

PV = "0.38.0"

RPM_NAME = "python39-M2Crypto-0.38.0-6.3.aarch64.rpm"
RPM_HASH = "79cfb724a58882d15ef0fc165f543152a5cb3cc2f39cda6b2c40a66da7b817a66f19f2933062942947836546281593aca0b537bac9e28f0d9eef1df5dadcf505"

RPROVIDES:${PN} += "python3.9dist(m2crypto) \
python39-M2Crypto \
python39-M2Crypto(aarch-64) \
python3dist(m2crypto)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi) \
python39-typing \
python39-xml"

inherit rpm
