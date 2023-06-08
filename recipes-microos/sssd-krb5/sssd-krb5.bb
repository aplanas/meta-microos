SUMMARY = "The Kerberos authentication backend plugin for sssd"
DESCRIPTION = "Provides the Kerberos back end that the SSSD can utilize authenticate \
against a Kerberos server."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "sssd-krb5-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "4973cea787bec41cbebf781b93984d6c9fa13fe52baa4ad62d4c714c396bcf98f26f7299078bf11a6bf854566529d0693389dde806f70cc5d534355cabbf5648"

RPROVIDES:${PN} += "libsss_krb5.so()(64bit) sssd-krb5 sssd-krb5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.8.2)(64bit) libsss_krb5_common.so()(64bit) libsss_krb5_common.so(V_2.8.2)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.8.2)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) sssd-krb5-common"

inherit rpm
