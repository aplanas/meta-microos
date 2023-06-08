SUMMARY = "PAM Authentication Module for Using Cryptographic Tokens"
DESCRIPTION = "Pam_p11 is a pluggable authentication module (pam) package for using \
cryptographic tokens, such as smart cards and usb crypto tokens, for \
authentication. \
 \
Pam_p11 has limited functionality since it simply compares public \
keys to sign some random data and verifies the signature with the \
public key. This works fine for small installations but may have \
security implications, see README.SUSE."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "pam_p11-0.3.1-3.2.aarch64.rpm"
RPM_HASH = "408d692f373bbbb4bca0f94c3bfb8e2ae0721629461ae917029f7cd8046d4b93885999f7baa480e5fc04d442983c253f6283d42627a025fa9ed1860d53da858b"

RPROVIDES:${PN} += "pam_p11 pam_p11(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libp11.so.3()(64bit) libp11.so.3(LIBP11_3)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit)"

inherit rpm
