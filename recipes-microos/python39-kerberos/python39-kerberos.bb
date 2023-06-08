SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python39-kerberos-1.3.1-1.12.aarch64.rpm"
RPM_HASH = "37364873e06a137ae2c31ccb34a66ab26c8f8faac92f2e742a7885202089711f9b1f600db30ebf32c00284341767c49816719b7d751295d268f4b3e68d731a69"

RPROVIDES:${PN} += "python3.9dist(kerberos) python39-kerberos python39-kerberos(aarch-64) python3dist(kerberos)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcom_err.so.2()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) python(abi)"

inherit rpm
