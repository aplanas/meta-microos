SUMMARY = "Javadoc for ldap-sdk"
DESCRIPTION = "Javadoc for ldap-sdk"
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.0-or-later"

PV = "4.21.0"

RPM_NAME = "ldap-sdk-javadoc-4.21.0-2.6.noarch.rpm"
RPM_HASH = "1b05b6e1257865bb508a9f4036580bfb309c6c3b358a14259e502e40971e1a3cd503313f0ea38fd53f9199d254333d5b17723019d5bd20010c958d7f698718fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldap-sdk-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
