SUMMARY = "A help service to work with git repositories in OBS"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "obs-scm-bridge-0.3.0-1.1.noarch.rpm"
RPM_HASH = "97ae49a5835bf7ac2d488d6976291f1fba280fc0f4e9bc26debed7f7699079418daa4407ecd33cd9561b526ba07c538ab3080710656fae08baaaf1c67a8e2e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-scm-bridge"
RDEPENDS:${PN} += "/usr/bin/python3 build perl(Date::Parse) perl(LWP::UserAgent) perl(Net::SSL) perl(Pod::Usage) perl(Time::Zone) perl(URI) perl(XML::Parser) perl(YAML::LibYAML)"

inherit rpm
