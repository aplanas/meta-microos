SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python310-kerberos-1.3.1-1.12.aarch64.rpm"
RPM_HASH = "4d7084656afc56edd5d5995e875a0ff9ae377619bb2b9fc17a64569fa468fd18411d0b1f0e2cbfeaf7879df08fd27b362fe80704dd0dcc11f4752143b8472580"

RPROVIDES:${PN} += "python3-kerberos python3.10dist(kerberos) python310-kerberos python310-kerberos(aarch-64) python3dist(kerberos)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcom_err.so.2()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) python(abi)"

inherit rpm
