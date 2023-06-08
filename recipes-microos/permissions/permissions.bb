SUMMARY = "SUSE Linux Default Permissions"
DESCRIPTION = "File and directory permission settings depending on the local security \
settings. The local security setting ('easy', 'secure', or 'paranoid') can be \
configured in /etc/sysconfig/security. \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230424"

RPM_NAME = "permissions-1699_20230424-1.1.aarch64.rpm"
RPM_HASH = "f00233bc4b670cddf248867dd9cd91a83d274275ed363636ef2b408d24c663409c7e0aba6ec12175f6cbaa7423f80b033f2f673322bf7fb63c9e6c1f7db998d1"

RPROVIDES:${PN} += "aaa_base:/usr/share/permissions permissions permissions(aarch-64)"
RDEPENDS:${PN} += "chkstat permissions-config"

inherit rpm
