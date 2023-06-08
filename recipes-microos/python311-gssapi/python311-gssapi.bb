SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python311-gssapi-1.8.2-2.1.aarch64.rpm"
RPM_HASH = "0a55efb9f50ac15b6fb7f210668b5ae35bcdb374a864406cdd8391a5439f06d9b571106133b0606c6b7aeebb7c0e34c7b87345c7709979daddbd19306896f39b"

RPROVIDES:${PN} += "python3.11dist(gssapi) python311-gssapi python311-gssapi(aarch-64) python3dist(gssapi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) python(abi) python311-decorator"

inherit rpm
