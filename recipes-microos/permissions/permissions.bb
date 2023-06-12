SUMMARY = "SUSE Linux Default Permissions"
DESCRIPTION = "File and directory permission settings depending on the local security \
settings. The local security setting ('easy', 'secure', or 'paranoid') can be \
configured in /etc/sysconfig/security. \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230516"

RPM_NAME = "permissions-1699_20230516-1.1.aarch64.rpm"
RPM_HASH = "79f906d0ef8739a9a2966ba7f30de3ac7d47f01cfa8b55a7e999e92582c97581d84b758e0013d342c0dbbe1c43f56fe2f4ddca9c9369f6d04cb1f0a002aa4e2b"

RPROVIDES:${PN} += "aaa_base:/usr/share/permissions permissions permissions(aarch-64)"
RDEPENDS:${PN} += "chkstat permissions-config"

inherit rpm
