SUMMARY = "File encryption, decryption, signature creation and verification utility"
DESCRIPTION = "GnuPG is a hybrid-encryption software program; it uses a combination \
of symmetric-key and public-key cryptography to encrypt/decrypt \
messages and/or to sign and verify them. \
 \
gpg2 provides GPGSM, gpg-agent, and a keybox library."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "gpg2-2.3.8-1.3.aarch64.rpm"
RPM_HASH = "70e001d7afa164b65283d5c62d2786a136e2d55c96b675bd93876ce68375674b77cf11bc3a1ffae8c5a769fed09dc243a74baaae34de037c7a8eee8a6368a132"

RPROVIDES:${PN} += "config(gpg2) gnupg gpg gpg2 gpg2(aarch-64) newpg"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libassuan.so.0()(64bit) libassuan.so.0(LIBASSUAN_1.0)(64bit) libassuan0 libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgcrypt20 libgpg-error.so.0()(64bit) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) libksba libksba.so.8()(64bit) libksba.so.8(KSBA_0.9)(64bit) libnpth.so.0()(64bit) libnpth.so.0(NPTH_1.0)(64bit) libreadline.so.8()(64bit) libsqlite3.so.0()(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit) pinentry"

inherit rpm
