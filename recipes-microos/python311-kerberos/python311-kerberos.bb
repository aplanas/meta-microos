SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python311-kerberos-1.3.1-1.12.aarch64.rpm"
RPM_HASH = "5dce26088b5133c631cda2b4543399201a3ee8dd8061488fb85b5fda419a5bba2703891927021b879ac5bca32ff0b64edee575fa9f2b4ba60590a3a6457949bb"

RPROVIDES:${PN} += "python3.11dist(kerberos) python311-kerberos python311-kerberos(aarch-64) python3dist(kerberos)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcom_err.so.2()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) python(abi)"

inherit rpm
