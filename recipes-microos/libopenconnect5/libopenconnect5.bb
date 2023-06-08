SUMMARY = "Libraries for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN."
LICENSE = "LGPL-2.1-or-later"

PV = "9.10"

RPM_NAME = "libopenconnect5-9.10-1.1.aarch64.rpm"
RPM_HASH = "99d44c05fec6de62f01341c5aa6ddcabbab7b725b99041aa2c838c84222d67a57e04338285a817aec1570619b23e2488d9e4bdbb7578121011a6694eeeb9f242"

RPROVIDES:${PN} += "libopenconnect.so.5()(64bit) libopenconnect.so.5(OPENCONNECT_5.0)(64bit) libopenconnect.so.5(OPENCONNECT_5_1)(64bit) libopenconnect.so.5(OPENCONNECT_5_2)(64bit) libopenconnect.so.5(OPENCONNECT_5_3)(64bit) libopenconnect.so.5(OPENCONNECT_5_4)(64bit) libopenconnect.so.5(OPENCONNECT_5_5)(64bit) libopenconnect.so.5(OPENCONNECT_5_6)(64bit) libopenconnect.so.5(OPENCONNECT_5_7)(64bit) libopenconnect.so.5(OPENCONNECT_5_8)(64bit) libopenconnect.so.5(OPENCONNECT_PRIVATE)(64bit) libopenconnect5 libopenconnect5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgmp.so.10()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_0)(64bit) libgnutls.so.30(GNUTLS_3_6_13)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libp11-kit.so.0()(64bit) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) libpcsclite.so.1()(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libpskc.so.0()(64bit) libpskc.so.0(LIBPSKC_2.0.0)(64bit) libpskc.so.0(LIBPSKC_2.2.0)(64bit) libstoken.so.1()(64bit) libstoken.so.1(STOKEN_1.0)(64bit) libstoken.so.1(STOKEN_1.2)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
