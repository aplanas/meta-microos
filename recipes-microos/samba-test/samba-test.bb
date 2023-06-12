SUMMARY = "Testing tools for Samba servers and clients"
DESCRIPTION = "samba-test provides testing tools for both the server and client \
packages of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-test-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "c9a7098d66deed3559790fe12194b463d774430eb07762eaa3c7e8cb5d7cd660514afbfb7bd0a97458c8c32b998f1c4114cd2e1fe2831153fd13d54e93d01310"

RPROVIDES:${PN} += "samba-test \
samba-test(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLIBWBCLIENT-OLD-samba4.so()(64bit) \
libLIBWBCLIENT-OLD-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libMESSAGING-SEND-samba4.so()(64bit) \
libMESSAGING-SEND-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libMESSAGING-samba4.so()(64bit) \
libMESSAGING-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libRPC-SERVER-LOOP-samba4.so()(64bit) \
libRPC-SERVER-LOOP-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libaddns-samba4.so()(64bit) \
libaddns-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libads-samba4.so()(64bit) \
libads-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libasn1util-samba4.so()(64bit) \
libasn1util-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libauth-samba4.so()(64bit) \
libauth-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libauthkrb5-samba4.so()(64bit) \
libauthkrb5-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-cldap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-ldap-common-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-ldap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcli-nbt-samba4.so()(64bit) \
libcli-nbt-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcli-smb-common-samba4.so()(64bit) \
libcli-smb-common-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcliauth-samba4.so()(64bit) \
libcliauth-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcluster-samba4.so()(64bit) \
libcluster-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcmdline-contexts-samba4.so()(64bit) \
libcmdline-contexts-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcmdline-samba4.so()(64bit) \
libcmdline-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libcommon-auth-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libdbwrap-samba4.so()(64bit) \
libdbwrap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-binding.so.0(DCERPC_BINDING_0.0.1)(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc-samba-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libdcerpc-samba4.so()(64bit) \
libdcerpc-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libdcerpc-server-core.so.0()(64bit) \
libdcerpc-server-core.so.0(DCERPC_SERVER_CORE_0.0.1)(64bit) \
libdcerpc.so.0()(64bit) \
libdcerpc.so.0(DCERPC_0.0.1)(64bit) \
libdlz-bind9-for-torture-samba4.so()(64bit) \
libdlz-bind9-for-torture-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libdnsserver-common-samba4.so()(64bit) \
libdnsserver-common-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libdsdb-module-samba4.so()(64bit) \
libdsdb-module-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libevents-samba4.so()(64bit) \
libevents-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libflag-mapping-samba4.so()(64bit) \
libflag-mapping-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libgenrand-samba4.so()(64bit) \
libgenrand-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libgensec-samba4.so()(64bit) \
libgensec-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgse-samba4.so()(64bit) \
libgse-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libidmap-samba4.so()(64bit) \
libidmap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
libkrb5samba-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libldb.so.2(LDB_0.9.15)(64bit) \
libldb.so.2(LDB_0.9.16)(64bit) \
libldb.so.2(LDB_1.1.14)(64bit) \
libldb.so.2(LDB_2.0.1)(64bit) \
libldb.so.2(LDB_2.7.2)(64bit) \
libldbsamba-samba4.so()(64bit) \
libldbsamba-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
liblibcli-lsa3-samba4.so()(64bit) \
liblibcli-lsa3-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
liblibcli-netlogon3-samba4.so()(64bit) \
liblibcli-netlogon3-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
liblibsmb-samba4.so()(64bit) \
liblibsmb-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libmsrpc3-samba4.so()(64bit) \
libmsrpc3-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libndr-krb5pac.so.0()(64bit) \
libndr-krb5pac.so.0(NDR_KRB5PAC_0.0.1)(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-nbt.so.0(NDR_NBT_0.0.1)(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libndr-samba4.so()(64bit) \
libndr-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libndr-standard.so.0()(64bit) \
libndr-standard.so.0(NDR_STANDARD_0.0.1)(64bit) \
libndr.so.3()(64bit) \
libndr.so.3(NDR_0.0.1)(64bit) \
libndr.so.3(NDR_0.0.3)(64bit) \
libndr.so.3(NDR_0.0.4)(64bit) \
libndr.so.3(NDR_0.0.8)(64bit) \
libndr.so.3(NDR_0.0.9)(64bit) \
libndr.so.3(NDR_0.2.0)(64bit) \
libndr.so.3(NDR_1.0.0)(64bit) \
libnetapi.so.1()(64bit) \
libnetapi.so.1(NETAPI_1.0.0)(64bit) \
libnetif-samba4.so()(64bit) \
libnetif-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libnss-info-samba4.so()(64bit) \
libnss-info-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libprinter-driver-samba4.so()(64bit) \
libprinter-driver-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libreadline.so.8()(64bit) \
libregistry-samba4.so()(64bit) \
libregistry-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libreplace-samba4.so()(64bit) \
libreplace-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-credentials.so.1(SAMBA_CREDENTIALS_1.0.0)(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-debug-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-errors.so.1(SAMBA_ERRORS_1.0.0)(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-hostconfig.so.0(SAMBA_HOSTCONFIG_0.0.1)(64bit) \
libsamba-modules-samba4.so()(64bit) \
libsamba-modules-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so()(64bit) \
libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-passdb.so.0(SAMBA_PASSDB_0.2.0)(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-security-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-sockets-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-util.so.0()(64bit) \
libsamba-util.so.0(SAMBA_UTIL_0.0.1)(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsamba3-util-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb-common-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamdb.so.0()(64bit) \
libsamdb.so.0(SAMDB_0.0.1)(64bit) \
libsecrets3-samba4.so()(64bit) \
libsecrets3-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libserver-id-db-samba4.so()(64bit) \
libserver-id-db-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libshares-samba4.so()(64bit) \
libshares-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsmbclient-raw-samba4.so()(64bit) \
libsmbclient-raw-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsmbclient.so.0()(64bit) \
libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) \
libsmbclient.so.0(SMBCLIENT_0.3.1)(64bit) \
libsmbclient.so.0(SMBCLIENT_0.3.2)(64bit) \
libsmbclient.so.0(SMBCLIENT_0.3.3)(64bit) \
libsmbclient.so.0(SMBCLIENT_0.5.0)(64bit) \
libsmbclient.so.0(SMBCLIENT_0.6.0)(64bit) \
libsmbconf.so.0()(64bit) \
libsmbconf.so.0(SMBCONF_0.0.1)(64bit) \
libsmbd-shim-samba4.so()(64bit) \
libsmbd-shim-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsmbpasswdparser-samba4.so()(64bit) \
libsmbpasswdparser-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libsocket-blocking-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsys-rw-samba4.so()(64bit) \
libsys-rw-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtalloc.so.2(TALLOC_2.0.8)(64bit) \
libtalloc.so.2(TALLOC_2.1.0)(64bit) \
libtalloc.so.2(TALLOC_2.3.5)(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtdb-wrap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtdb.so.1()(64bit) \
libtdb.so.1(TDB_1.2.1)(64bit) \
libtevent-util.so.0()(64bit) \
libtevent-util.so.0(TEVENT_UTIL_0.0.1)(64bit) \
libtevent.so.0()(64bit) \
libtevent.so.0(TEVENT_0.11.0)(64bit) \
libtevent.so.0(TEVENT_0.12.0)(64bit) \
libtevent.so.0(TEVENT_0.13.0)(64bit) \
libtevent.so.0(TEVENT_0.9.12)(64bit) \
libtevent.so.0(TEVENT_0.9.13)(64bit) \
libtevent.so.0(TEVENT_0.9.14)(64bit) \
libtevent.so.0(TEVENT_0.9.16)(64bit) \
libtevent.so.0(TEVENT_0.9.20)(64bit) \
libtevent.so.0(TEVENT_0.9.21)(64bit) \
libtevent.so.0(TEVENT_0.9.26)(64bit) \
libtevent.so.0(TEVENT_0.9.30)(64bit) \
libtevent.so.0(TEVENT_0.9.31)(64bit) \
libtevent.so.0(TEVENT_0.9.36)(64bit) \
libtevent.so.0(TEVENT_0.9.37)(64bit) \
libtevent.so.0(TEVENT_0.9.9)(64bit) \
libtime-basic-samba4.so()(64bit) \
libtime-basic-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtorture-samba4.so()(64bit) \
libtorture-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtrusts-util-samba4.so()(64bit) \
libtrusts-util-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libutil-reg-samba4.so()(64bit) \
libutil-reg-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libutil-tdb-samba4.so()(64bit) \
libutil-tdb-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libwbclient.so.0()(64bit) \
libwbclient.so.0(WBCLIENT_0.10)(64bit) \
libwbclient.so.0(WBCLIENT_0.9)(64bit) \
samba \
samba-winbind"

inherit rpm
