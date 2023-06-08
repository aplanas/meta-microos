SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kldap-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "183d009a6538078999c30649688cd7da2c1ea8943076a04564543dc64e9b7457e79b144a943ab93e32330543842f4f9cbce462f720bc0b7ae2fb9c1b83942650"

RPROVIDES:${PN} += "cmake(KF5Ldap) cmake(KPim5Ldap) kldap-devel kldap-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cyrus-sasl-devel libKPim5Ldap5 openldap2-devel"

inherit rpm
