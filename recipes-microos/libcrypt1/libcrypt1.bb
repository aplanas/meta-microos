SUMMARY = "Extended crypt library for DES, MD5, Blowfish and others"
DESCRIPTION = "libxcrypt is a modern library for one-way hashing of passwords.  It \
supports DES, MD5, SHA-2-256, SHA-2-512, and bcrypt-based password \
hashes, and provides the traditional Unix 'crypt' and 'crypt_r' \
interfaces, as well as a set of extended interfaces pioneered by \
Openwall Linux, 'crypt_rn', 'crypt_ra', 'crypt_gensalt', \
'crypt_gensalt_rn', and 'crypt_gensalt_ra'."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.33"

RPM_NAME = "libcrypt1-4.4.33-3.1.aarch64.rpm"
RPM_HASH = "5de432d079987cf016e661e753e747291c6f18959c2fcc494b8aae0dbf7cb264138be24ac71bd70bac8dc11fb04cff8a9b5e50861e5c7b5e33d639eb9506fdea"

RPROVIDES:${PN} += "libcrypt.so.1()(64bit) libcrypt.so.1(GLIBC_2.17)(64bit) libcrypt.so.1(OW_CRYPT_1.0)(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypt.so.1(XCRYPT_4.3)(64bit) libcrypt.so.1(XCRYPT_4.4)(64bit) libcrypt1 libcrypt1(aarch-64) libowcrypt.so.1()(64bit) libowcrypt.so.1(OW_CRYPT_1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit)"

inherit rpm
