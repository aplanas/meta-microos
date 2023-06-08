SUMMARY = "A command line mail reader (or MUA), a fork of Mutt with added features"
DESCRIPTION = "NeoMutt is a command line mail reader based on Mutt, brings together many \
new features. Can be installed in parallel with mutt."
LICENSE = "GPL-2.0-or-later"

PV = "20230407"

RPM_NAME = "neomutt-20230407-1.1.aarch64.rpm"
RPM_HASH = "547e5e072c439fa7b1d472befe6e5f95e8f2c64aef6e855a18761e7afb006741d987d19b9cad7731cd831e54828c71cf210bca0767209f0ce37e44b6ccd5bc27"

RPROVIDES:${PN} += "config(neomutt) neomutt neomutt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) libkyotocabinet.so.16()(64bit) liblmdb-0.9.30.so()(64bit) liblua5.4.so.5()(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libnotmuch.so.5()(64bit) libpcre2-8.so.0()(64bit) libsasl2.so.3()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
