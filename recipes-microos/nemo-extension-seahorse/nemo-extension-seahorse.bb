SUMMARY = "OpenPGP encryption/decryption extension for Nemo file manager"
DESCRIPTION = "seahorse nemo is an extension for nemo which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-seahorse-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "ce956fe10e0cc6c73bf6d7411b6a2c0d104e2c5163bf1638151de3c775c65126b51757eaebb444df8d362145af448a2ba61049295ac0d3e893a35edc8ef6c6ef"

RPROVIDES:${PN} += "application() application(nemo-seahorse-pgp-encrypted.desktop) application(nemo-seahorse-pgp-keys.desktop) application(nemo-seahorse-pgp-signature.desktop) libnemo-image-converter.so()(64bit) libnemo-seahorse.so()(64bit) mimehandler(application/pgp-encrypted) mimehandler(application/pgp-keys) mimehandler(application/pgp-signature) nemo-extension-seahorse nemo-extension-seahorse(aarch-64) nemo-seahorse"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcryptui.so.0()(64bit) libdbus-glib-1.so.2()(64bit) libgcr-base-3.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libgtk-3.so.0()(64bit) libnemo-extension.so.1()(64bit) libnotify.so.4()(64bit) nautilus-extension-seahorse nemo"

inherit rpm
