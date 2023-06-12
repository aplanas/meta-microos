SUMMARY = "GNU Package manager"
DESCRIPTION = "Purely functional package manager and a distribution thereof. \
It offers transactional upgrades, roll-backs, unprivileged package management. \
As a GNU distribution it contains only free software."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "guix-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "7be748ac9fd6c31ecfc844134ddded18df2357a40472a3301cec96b3531ecc502cb01342797d61b0c38b5b22b677a493ab771934f00da6da98d46d687a15c8f8"

RPROVIDES:${PN} += "/usr/libexec/guix/guile \
guix \
guix(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnutls-guile \
guile \
guile-gcrypt \
guile-git \
guile-json \
guile-lzlib \
guile-sqlite3 \
guile-ssh-devel \
guile-zlib \
gzip \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcrypt-devel \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libguile-3.0.so.1()(64bit) \
libguile-3.0.so.1(GUILE_2.0)(64bit) \
libguile-ssh14 \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.23)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.5)(64bit)"

inherit rpm
