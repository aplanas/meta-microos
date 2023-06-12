SUMMARY = "Spam filtering system"
DESCRIPTION = "Rspamd is a spam filtering system that allows evaluation of messages \
by a number of rules including regular expressions, statistical analysis and \
custom services such as URL black lists. Each message is analysed by rspamd and \
given a 'spam score'. \
 \
According to this spam score and the user's settings, rspamd recommends an \
action for the MTA to apply to the message, for example to pass, reject or add \
a header.  Rspamd is designed to process hundreds of messages per second \
simultaneously and has a number of features available."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "rspamd-3.5-1.2.aarch64.rpm"
RPM_HASH = "cb610e1442df157040ddd12d058d0aea356cd68ca7f8bf0717f2df2681ff407633f3637bd06fa7570c370adf917733b5519eee077928710c7bfab772e8bd285b"

RPROVIDES:${PN} += "config(rspamd) librspamd-actrie.so()(64bit) librspamd-ev.so()(64bit) librspamd-kann.so()(64bit) librspamd-replxx.so()(64bit) librspamd-server.so()(64bit) rspamd rspamd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env apparmor-abstractions ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libglib-2.0.so.0()(64bit) libicui18n.so.73()(64bit) libicuuc.so.73()(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas.so.0()(64bit) libpcre2-8.so.0()(64bit) libsodium.so.23()(64bit) libsqlite3.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libunwind.so.8()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) lua54-lpeg shadow"

inherit rpm
