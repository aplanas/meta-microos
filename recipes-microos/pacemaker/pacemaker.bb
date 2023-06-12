SUMMARY = "Scalable High-Availability cluster resource manager"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
It supports more than 16 node clusters with significant capabilities \
for managing resources and dependencies. \
 \
It will run scripts at initialization, when machines go up or down, \
when related resources fail and can be configured to periodically check \
resource health."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-2.1.5+20230320.22590c566-1.1.aarch64.rpm"
RPM_HASH = "2dfa33014e83a4abb1dd5c24a711e31c129921063cb47b9b96f4c8c8b0f3feb94f9bb0fcf91e32a894a6eb9d5379c14c0f2cd7e7ed3e64e0a578be1f269775db"

RPROVIDES:${PN} += "pacemaker \
pacemaker(aarch-64) \
pacemaker-ticket-support"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3 \
corosync \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfg.so.6()(64bit) \
libcfg.so.6(COROSYNC_CFG_0.82)(64bit) \
libcib.so.27()(64bit) \
libcmap.so.4()(64bit) \
libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) \
libcorosync_common.so.4()(64bit) \
libcpg.so.4()(64bit) \
libcpg.so.4(COROSYNC_CPG_1.0)(64bit) \
libcrmcluster.so.29()(64bit) \
libcrmcommon.so.34()(64bit) \
libcrmservice.so.28()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
liblrmd.so.28()(64bit) \
libpacemaker.so.1()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpe_rules.so.26()(64bit) \
libpe_status.so.28()(64bit) \
libqb.so.100()(64bit) \
libstonithd.so.26()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
pacemaker-cli \
pacemaker-libs \
python3 \
python3-pacemaker \
resource-agents \
systemd"

inherit rpm
