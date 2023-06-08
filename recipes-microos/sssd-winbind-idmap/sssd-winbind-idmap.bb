SUMMARY = "The sss idmap backend for Winbind"
DESCRIPTION = "The idmap_sss module provides a way for Winbind to call SSSD to map \
UIDs/GIDs and SIDs."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "sssd-winbind-idmap-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "f5e9dba2ce977cbffae433bed24eb763cdbadac69ad76c7575278511693ac2e72c0b585e88be084107ff7aa3294a018ae354e346899dbb919ea31761c654096e"

RPROVIDES:${PN} += "sssd-winbind-idmap sssd-winbind-idmap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsss_idmap.so.0()(64bit) libsss_idmap.so.0(SSS_IDMAP_0.4)(64bit) libsss_nss_idmap.so.0()(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.0.1)(64bit) libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.5.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
