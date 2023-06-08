SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-sysinit-3.89-1.1.aarch64.rpm"
RPM_HASH = "096682ac424b8fc0237cebc8da0f511a653d6bb0ab1bd44ee85749dd15b37836d1de73c67917341ae39a558c5fdf76c898411c5317a97da5cfca236ce51c5d59"

RPROVIDES:${PN} += "config(mozilla-nss-sysinit) libnsssysinit.so()(64bit) libnsssysinit.so(NSS_3.15)(64bit) mozilla-nss-sysinit mozilla-nss-sysinit(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig coreutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libnspr4.so()(64bit) libnssutil3.so()(64bit) libnssutil3.so(NSSUTIL_3.12)(64bit) libnssutil3.so(NSSUTIL_3.14)(64bit) libplc4.so()(64bit) mozilla-nss"

inherit rpm
