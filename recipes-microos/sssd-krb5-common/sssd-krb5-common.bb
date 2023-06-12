SUMMARY = "SSSD helpers needed for Kerberos and GSSAPI authentication"
DESCRIPTION = "Provides helper processes that the LDAP and Kerberos back ends can \
use for Kerberos user or host authentication."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-krb5-common-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "88895ee04dfb177eb16612399d096195cbd5226b08da255d4f75c3eff05c9310989d768bf2149c60f481e54ea431d51a550a46babc6a65d39dc6906b0100c6fe"

RPROVIDES:${PN} += "libsss_krb5_common.so()(64bit) libsss_krb5_common.so(V_2.9.0)(64bit) sssd-krb5-common sssd-krb5-common(aarch-64)"
RDEPENDS:${PN} += "cyrus-sasl-gssapi ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libkeyutils.so.1()(64bit) libkeyutils.so.1(KEYUTILS_0.3)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libsss_child.so()(64bit) libsss_child.so(V_2.9.0)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.9.0)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.9.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit)"

inherit rpm
