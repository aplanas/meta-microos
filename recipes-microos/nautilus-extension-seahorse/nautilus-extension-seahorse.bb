SUMMARY = "Extension for nautilus which allows encryption and decryption of files"
DESCRIPTION = "Seahorse nautilus is an extension for nautilus which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.92+95"

RPM_NAME = "nautilus-extension-seahorse-3.11.92+95-1.3.aarch64.rpm"
RPM_HASH = "cc54b4db63c88f27b98e2fd6781e6b961bd348638b956a34ae381de3b6c097a80f193349231b185117a28934c1214490b14f704179fac03a1da3ca24da0b57b3"

RPROVIDES:${PN} += "application() application(seahorse-pgp-encrypted.desktop) application(seahorse-pgp-keys.desktop) application(seahorse-pgp-signature.desktop) libnautilus-seahorse.so()(64bit) mimehandler(application/pgp-encrypted) mimehandler(application/pgp-keys) mimehandler(application/pgp-signature) nautilus-extension-seahorse nautilus-extension-seahorse(aarch-64) seahorse-nautilus"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcryptui.so.0()(64bit) libdbus-glib-1.so.2()(64bit) libgcr-base-3.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libgtk-3.so.0()(64bit) libnautilus-extension.so.4()(64bit)"

inherit rpm
