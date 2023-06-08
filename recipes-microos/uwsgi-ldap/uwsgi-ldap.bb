SUMMARY = "LDAP Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for configuring uWSGI via LDAP."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-ldap-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "fd41f3c10103f5a71269987df0d72f351d9477587ea823318a35f18e74888997c6bc5a02003bae115c806f1e6d60bf0be21820ee2e178119c97937ee56bffead"

RPROVIDES:${PN} += "uwsgi-ldap uwsgi-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) uwsgi"

inherit rpm
