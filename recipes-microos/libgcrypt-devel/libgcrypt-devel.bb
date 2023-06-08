SUMMARY = "The GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose library of cryptographic building \
blocks.  It is originally based on code used by GnuPG.  It does not \
provide any implementation of OpenPGP or other protocols.  Thorough \
understanding of applied cryptography is required to use Libgcrypt. \
 \
This package contains needed files to compile and link against the \
library."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.10.2"

RPM_NAME = "libgcrypt-devel-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "3c886894b72ef0d06193d9d9baee8f16f55a855e2354d516c69d2fd21bdbb2aade9c87b1eaa6e459539c7fd765063b299a5fa6407efead458668b8e5d790d9dc"

RPROVIDES:${PN} += "libgcrypt-devel libgcrypt-devel(aarch-64) pkgconfig(libgcrypt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config glibc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgcrypt20 libgpg-error-devel libgpg-error.so.0()(64bit) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) pkgconfig(gpg-error)"

inherit rpm
