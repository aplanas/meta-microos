SUMMARY = "OO interface for testing low-level Plack/PSGI apps"
DESCRIPTION = "OO interface for testing low-level Plack/PSGI apps"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.5"

RPM_NAME = "perl-Plack-Test-Agent-1.5-1.10.noarch.rpm"
RPM_HASH = "a192a3d8f594e01f3587542aa4bffa6378189845751194bcce69c5fe66a7baa38128858c9b2988d7a2dd21b564d3beb13dee700d2e4d9f066fad58437a1a9d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Plack::Test::Agent) perl(Test::WWW::Mechanize::Bound) perl-Plack-Test-Agent"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Cookies) perl(HTTP::Message::PSGI) perl(HTTP::Request::Common) perl(HTTP::Response) perl(Plack::Loader) perl(Plack::Util::Accessor) perl(Test::TCP) perl(Test::WWW::Mechanize) perl(parent)"

inherit rpm
