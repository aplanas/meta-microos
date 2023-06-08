SUMMARY = "Caching and forwarding HTTP web proxy"
DESCRIPTION = "Squid is a caching proxy for the Web supporting HTTP(S), FTP, and \
some others. It reduces bandwidth and improves response times by \
caching and reusing frequently-requested web pages. Squid has \
extensive access controls and can also be used as a server \
accelerator."
LICENSE = "GPL-2.0-or-later"

PV = "5.8"

RPM_NAME = "squid-5.8-2.1.aarch64.rpm"
RPM_HASH = "6827317dcb404d748082a82b6f78abada918161fc563c43961075d6d7bc94a7bdfbbfbd9c2620cdf2bbca295304bdd07d040eb67be98469991ac401bf35dfd9a"

RPROVIDES:${PN} += "config(squid) group(squid) group(winbind) http_proxy squid squid(aarch-64) user(squid)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl /usr/bin/sed ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcom_err.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libltdl.so.7()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libsasl2.so.3()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtdb.so.1()(64bit) libtdb.so.1(TDB_1.2.1)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) permissions sysuser-shadow"

inherit rpm
