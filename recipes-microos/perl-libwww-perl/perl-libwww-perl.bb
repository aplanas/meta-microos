SUMMARY = "The World-Wide Web library for Perl"
DESCRIPTION = "The World-Wide Web library for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.68"

RPM_NAME = "perl-libwww-perl-6.68-1.1.noarch.rpm"
RPM_HASH = "7807614f2fe05faa51d09887391eee220b18598f2eaf8fb4661189469a9d85932856d20a830058a38cb95b2331483f3746cd7b8961a46c989c8b8fbba95ba2e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(LWP) perl(LWP::Authen::Basic) perl(LWP::Authen::Digest) perl(LWP::Authen::Ntlm) perl(LWP::ConnCache) perl(LWP::Debug) perl(LWP::Debug::TraceHTTP) perl(LWP::DebugFile) perl(LWP::MemberMixin) perl(LWP::Protocol) perl(LWP::Protocol::cpan) perl(LWP::Protocol::data) perl(LWP::Protocol::file) perl(LWP::Protocol::ftp) perl(LWP::Protocol::gopher) perl(LWP::Protocol::http) perl(LWP::Protocol::loopback) perl(LWP::Protocol::mailto) perl(LWP::Protocol::nntp) perl(LWP::Protocol::nogo) perl(LWP::RobotUA) perl(LWP::Simple) perl(LWP::UserAgent) perl-libwww-perl"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Encode::Locale) perl(File::Listing) perl(HTML::Entities) perl(HTML::HeadParser) perl(HTTP::Cookies) perl(HTTP::Date) perl(HTTP::Negotiate) perl(HTTP::Request) perl(HTTP::Request::Common) perl(HTTP::Response) perl(HTTP::Status) perl(LWP::MediaTypes) perl(Net::HTTP) perl(Try::Tiny) perl(URI) perl(URI::Escape) perl(WWW::RobotRules) perl(parent)"

inherit rpm
