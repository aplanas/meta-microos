SUMMARY = "Daemon for managing gss-api requests"
DESCRIPTION = "gssproxy allows the complexity of GSS security negotiation \
to be centrallized.  It is particularly useful to keep this out \
of kernel space, so that CIPFS, NFS, AFS etc can use GSS-API without \
complexity in the kernel. \
 \
Using it also improves isolation and privilege separation, so that \
HTTP servers, for example, can use GSS-API without needing to access \
keys directly."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "gssproxy-0.8.4-2.8.aarch64.rpm"
RPM_HASH = "339ac0dcfe74a7817c3c34461f6b7f6ced24e36e5391445b03a66a0b80895af2cbaa42fd4400c04398c6c8b827016ecc2c6d8fe6bb6ef42932154a29291553e9"

RPROVIDES:${PN} += "config(gssproxy) gssproxy gssproxy(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libgssrpc.so.4()(64bit) libgssrpc.so.4(gssrpc_4_MIT)(64bit) libini_config.so.5()(64bit) libini_config.so.5(INI_CONFIG_1.1.0)(64bit) libini_config.so.5(INI_CONFIG_1.2.0)(64bit) libk5crypto.so.3()(64bit) libk5crypto.so.3(k5crypto_3_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libref_array.so.1()(64bit) libref_array.so.1(REF_ARRAY_0.1.1)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libverto.so.1()(64bit) systemd"

inherit rpm
