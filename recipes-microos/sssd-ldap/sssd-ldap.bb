SUMMARY = "The LDAP backend plugin for sssd"
DESCRIPTION = "Provides the LDAP back end that the SSSD can utilize to fetch \
identity data from and authenticate against an LDAP server."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "sssd-ldap-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "4f4ca35d01f79d00905f01d96abba2676e2956fb8002b957c948f96ca0606760fb7844e4c5248afb6be55114eb56eb3249b051135824d676622b65a64ebe36a2"

RPROVIDES:${PN} += "libsss_ldap.so()(64bit) libsss_ldap_common.so()(64bit) libsss_ldap_common.so(V_2.8.2)(64bit) sssd-ldap sssd-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libsss_cert.so()(64bit) libsss_cert.so(V_2.8.2)(64bit) libsss_certmap.so.0()(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.0)(64bit) libsss_child.so()(64bit) libsss_child.so(V_2.8.2)(64bit) libsss_crypt.so()(64bit) libsss_crypt.so(V_2.8.2)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.8.2)(64bit) libsss_idmap.so.0()(64bit) libsss_idmap.so.0(SSS_IDMAP_0.4)(64bit) libsss_idmap.so.0(SSS_IDMAP_0.5)(64bit) libsss_krb5_common.so()(64bit) libsss_krb5_common.so(V_2.8.2)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.8.2)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit) sssd-krb5-common"

inherit rpm
