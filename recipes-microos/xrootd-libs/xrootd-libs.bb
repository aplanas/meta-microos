SUMMARY = "XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by the XRootD servers and \
clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-libs-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "1bdce4f46b200eb933a2d121b1c29aecc4d3d27b5a80df4e0aff30bfaf6b86ce0ec518c5c739076839a243ca3f7f32f4932fbd11b1b51e360abe60ad352b0709"

RPROVIDES:${PN} += "libXrdAppUtils.so.2()(64bit) libXrdCksCalczcrc32-5.so()(64bit) libXrdClProxyPlugin-5.so()(64bit) libXrdCmsRedirectLocal-5.so()(64bit) libXrdCrypto.so.2()(64bit) libXrdCryptoLite.so.2()(64bit) libXrdCryptossl-5.so()(64bit) libXrdHttpUtils.so.2()(64bit) libXrdSec-5.so()(64bit) libXrdSecProt-5.so()(64bit) libXrdSecgsi-5.so()(64bit) libXrdSecgsiAUTHZVO-5.so()(64bit) libXrdSecgsiGMAPDN-5.so()(64bit) libXrdSeckrb5-5.so()(64bit) libXrdSecpwd-5.so()(64bit) libXrdSecsss-5.so()(64bit) libXrdSecunix-5.so()(64bit) libXrdSecztn-5.so()(64bit) libXrdUtils.so.3()(64bit) libXrdXml.so.3()(64bit) xrootd-libs xrootd-libs(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig glibc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libXrdCl.so.3()(64bit) libXrdServer.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libz.so.1()(64bit)"

inherit rpm
