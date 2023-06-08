SUMMARY = "LDAP Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-ldap-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "492de7038d00d98a0ee82a893bc0e358814a13c53140a11139b9574c380e07da5b1fa193fe52e622c342cf67a0dd9bca4b3e54d61ec3d7b80c7ff466e831375b"

RPROVIDES:${PN} += "libgda-6_0-ldap libgda-6_0-ldap(aarch-64) libgda-ldap-6.0.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
