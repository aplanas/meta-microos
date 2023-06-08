SUMMARY = "Provide commonly requested regular expressions"
DESCRIPTION = "By default, this module exports a single hash ('%RE') that stores or \
generates commonly needed regular expressions (see 'List of available \
patterns'). \
 \
There is an alternative, subroutine-based syntax described in \
'Subroutine-based interface'."
LICENSE = "Artistic-1.0 | Artistic-2.0 | BSD-3-Clause | MIT"

PV = "2017060201"

RPM_NAME = "perl-Regexp-Common-2017060201-1.22.noarch.rpm"
RPM_HASH = "91ab090664bcb0f81566ba703aa671e42b2f12e862c7414d54a71e4155eb7f74786c6963948c242da8a91c41fd27b52df6179c6fa17533d745227f57bd5877fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Regexp::Common) perl(Regexp::Common::CC) perl(Regexp::Common::Entry) perl(Regexp::Common::SEN) perl(Regexp::Common::URI) perl(Regexp::Common::URI::RFC1035) perl(Regexp::Common::URI::RFC1738) perl(Regexp::Common::URI::RFC1808) perl(Regexp::Common::URI::RFC2384) perl(Regexp::Common::URI::RFC2396) perl(Regexp::Common::URI::RFC2806) perl(Regexp::Common::URI::fax) perl(Regexp::Common::URI::file) perl(Regexp::Common::URI::ftp) perl(Regexp::Common::URI::gopher) perl(Regexp::Common::URI::http) perl(Regexp::Common::URI::news) perl(Regexp::Common::URI::pop) perl(Regexp::Common::URI::prospero) perl(Regexp::Common::URI::tel) perl(Regexp::Common::URI::telnet) perl(Regexp::Common::URI::tv) perl(Regexp::Common::URI::wais) perl(Regexp::Common::_support) perl(Regexp::Common::balanced) perl(Regexp::Common::comment) perl(Regexp::Common::delimited) perl(Regexp::Common::lingua) perl(Regexp::Common::list) perl(Regexp::Common::net) perl(Regexp::Common::number) perl(Regexp::Common::profanity) perl(Regexp::Common::whitespace) perl(Regexp::Common::zip) perl-Regexp-Common"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
