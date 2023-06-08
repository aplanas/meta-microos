SUMMARY = "Get Whois information of domains and IP addresses"
DESCRIPTION = "Net::Whois::Raw queries WHOIS servers about domains. The module supports \
recursive WHOIS queries. Also queries via HTTP is supported for some TLDs. \
 \
Setting the variables $OMIT_MSG and $CHECK_FAIL will match the results \
against a set of known patterns. The first flag will try to omit the \
copyright message/disclaimer, the second will attempt to determine if the \
search failed and return undef in such a case. \
 \
*IMPORTANT*: these checks merely use pattern matching; they will work on \
several servers but certainly not on all of them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.99037"

RPM_NAME = "perl-Net-Whois-Raw-2.99037-1.2.noarch.rpm"
RPM_HASH = "445a9ad6dccad3f613673a22ff7846164287ba2a0d7416ed77e7da5177a5f76d4a7afa119b4d823f964c900ab5fab37b2359394327a27d707fc4f5e6af702a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::Whois::Raw) perl(Net::Whois::Raw::Common) perl(Net::Whois::Raw::Data) perl-Net-Whois-Raw"
RDEPENDS:${PN} += "/usr/bin/env perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Headers) perl(HTTP::Request) perl(IO::Socket::IP) perl(LWP::UserAgent) perl(Net::IDN::Punycode) perl(Regexp::IPv6) perl(URI::URL)"

inherit rpm
