SUMMARY = "(X)HTML validation in a Perl object"
DESCRIPTION = "'HTML::Tidy' is an HTML checker in a handy dandy object. It's meant as a \
replacement for HTML::Lint. If you're currently an HTML::Lint user looking \
to migrate, see the section Converting from HTML::Lint."
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-HTML-Tidy-1.60-1.29.aarch64.rpm"
RPM_HASH = "8ca7511966a2aff0ca4e756ea23a7cf350088cc64cd9bee65436d0e7d4d9c344d844d15b944d10534b3994b494c8dc96305e0a489c49813ef5862903f9eb35b6"

RPROVIDES:${PN} += "perl(HTML::Tidy) perl(HTML::Tidy::Message) perl-HTML-Tidy perl-HTML-Tidy(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtidyp-1.04.so.0()(64bit) perl(:MODULE_COMPAT_5.36.0) perl(LWP::Simple) perl(Test::More)"

inherit rpm
