SUMMARY = "Upload things to the CPAN"
DESCRIPTION = "upload things to the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.103018"

RPM_NAME = "perl-CPAN-Uploader-0.103018-1.1.noarch.rpm"
RPM_HASH = "95321e2fe924f9784cea2bd702076a3c36787bc8aa9772dec7e3a8bb9783f327ea4cd1322e5d5873e9e4ab5fc614a5ef6c8a56e3093426b12b3ee58a6be07108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::Uploader) perl-CPAN-Uploader"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Getopt::Long::Descriptive) perl(HTTP::Request::Common) perl(HTTP::Status) perl(LWP::Protocol::https) perl(LWP::UserAgent) perl(Term::ReadKey)"

inherit rpm
