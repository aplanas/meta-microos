SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_nss_idmap-devel-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "37db88db74dc4d677292141bd42184f7600db70efce6dcb8d04b5ab1e8a6e42670ba8b93c1e06a9f2028f5773cfbd5e348f5ee3c496a0532f03dbcdd63ce28cb"

RPROVIDES:${PN} += "libsss_nss_idmap-devel libsss_nss_idmap-devel(aarch-64) pkgconfig(sss_nss_idmap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsss_nss_idmap0"

inherit rpm
