SUMMARY = "The SSSD D-Bus responder helper library"
DESCRIPTION = "This subpackage provides a library that simplifies the D-Bus API for \
the SSSD InfoPipe responder."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_simpleifp0-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "497963998675953278a1cead80f309d1ea36d8b237f80979723697687fdca6973c1572ba5e34e2e2875abea8a3f1492052326ecdb3d29bf6ca539bdc3defaaa1"

RPROVIDES:${PN} += "libsss_simpleifp.so.0()(64bit) libsss_simpleifp.so.0(SSS_SIMPLEIFP_0.0)(64bit) libsss_simpleifp.so.0(SSS_SIMPLEIFP_0.1)(64bit) libsss_simpleifp0 libsss_simpleifp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit)"

inherit rpm
