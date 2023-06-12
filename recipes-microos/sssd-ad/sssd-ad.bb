SUMMARY = "The ActiveDirectory backend plugin for sssd"
DESCRIPTION = "Provides the Active Directory back end that the SSSD can utilize to \
fetch identity data from and authenticate against an Active Directory \
server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-ad-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "1193aab54fedbc5d544e150b09d117a16ce89b8bc954401655f382b41954d2dd433456f7860534b02ea5b2ccaecb1774a77c583662db03c5f92c3ca07c3c1ec3"

RPROVIDES:${PN} += "libsss_ad.so()(64bit) sssd-ad sssd-ad(aarch-64)"
RDEPENDS:${PN} += "adcli ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libini_config.so.5()(64bit) libini_config.so.5(INI_CONFIG_1.1.0)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libndr-krb5pac.so.0()(64bit) libndr-krb5pac.so.0(NDR_KRB5PAC_0.0.1)(64bit) libndr-nbt.so.0()(64bit) libndr-nbt.so.0(NDR_NBT_0.0.1)(64bit) libndr.so.3()(64bit) libndr.so.3(NDR_0.0.1)(64bit) libndr.so.3(NDR_0.0.6)(64bit) libndr.so.3(NDR_1.0.0)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libsasl2.so.3()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsmbclient.so.0()(64bit) libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) libsss_child.so()(64bit) libsss_child.so(V_2.9.0)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.9.0)(64bit) libsss_idmap.so.0()(64bit) libsss_idmap.so.0(SSS_IDMAP_0.4)(64bit) libsss_iface.so()(64bit) libsss_iface.so(V_2.9.0)(64bit) libsss_krb5_common.so()(64bit) libsss_krb5_common.so(V_2.9.0)(64bit) libsss_ldap_common.so()(64bit) libsss_ldap_common.so(V_2.9.0)(64bit) libsss_sbus.so()(64bit) libsss_sbus.so(V_2.9.0)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.9.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtdb.so.1()(64bit) libtdb.so.1(TDB_1.2.1)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit) sssd-krb5-common"

inherit rpm
