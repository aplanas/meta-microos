SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_idmap-devel-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "162b643e97a1368db5f90645809ca9b841162da0fd9b749dff241173df5fd5ebedff255dcc775dc26f3020493d687fc3cfcf0385fc46b61b2724fd9def00f732"

RPROVIDES:${PN} += "libsss_idmap-devel libsss_idmap-devel(aarch-64) pkgconfig(sss_idmap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsss_idmap0"

inherit rpm
