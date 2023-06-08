SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_idmap0-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "a1b324973c1eaaf51f6cf0ddac769ea8a7d5ddbcd78204717fcbaa2605554c763424726dd9cb4829a106e39dadec5a5f2c2e991adccc8fbf248c32c3d52674b9"

RPROVIDES:${PN} += "libsss_idmap.so.0()(64bit) libsss_idmap.so.0(SSS_IDMAP_0.4)(64bit) libsss_idmap.so.0(SSS_IDMAP_0.5)(64bit) libsss_idmap0 libsss_idmap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
