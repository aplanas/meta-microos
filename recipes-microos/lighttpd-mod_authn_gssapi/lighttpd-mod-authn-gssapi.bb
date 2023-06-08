SUMMARY = "GSSAPI authentication in lighttpd"
DESCRIPTION = "A module to provide GSSAPI authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_authn_gssapi-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "e56e20b10ddf3ce7747737e69ad2f36aebe70a83b4d53dfba2ae46bff47aa268c77bff70e5d1cc6beb7fa27da4fa0a69f346f3f64cd2a7b525bc4de13aee42d5"

RPROVIDES:${PN} += "lighttpd-mod_authn_gssapi lighttpd-mod_authn_gssapi(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) lighttpd"

inherit rpm
