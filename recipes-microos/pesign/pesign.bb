SUMMARY = "Signing tool for PE-COFF binaries"
DESCRIPTION = "Signing tool for PE-COFF binaries. It is vaguely compliant \
with the PE and Authenticode specifications."
LICENSE = "GPL-3.0-or-later"

PV = "116"

RPM_NAME = "pesign-116-1.2.aarch64.rpm"
RPM_HASH = "997f83ca0d4793c5bc5d9dcca6a618cc25ce2e1222d415d1f88a08de2aa3ee0b7b443ea2594a12450666f6f3d9a4985f14625e593cc2a1834ce7921d7b965578"

RPROVIDES:${PN} += "config(pesign) group(pesign) pesign pesign(aarch-64) rpm_macro(_pesign) rpm_macro(_pesign_client) rpm_macro(pesign) user(pesign)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libefivar.so.1()(64bit) libefivar.so.1(libefivar.so.0)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10)(64bit) libnss3.so(NSS_3.11.7)(64bit) libnss3.so(NSS_3.12)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.5)(64bit) libnss3.so(NSS_3.6)(64bit) libnss3.so(NSS_3.9)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.15)(64bit) libsmime3.so(NSS_3.2)(64bit) libsmime3.so(NSS_3.3)(64bit) libsmime3.so(NSS_3.4)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) systemd sysuser-shadow"

inherit rpm
