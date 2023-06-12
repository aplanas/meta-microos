SUMMARY = "A help service to work with git repositories in OBS"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "obs-scm-bridge-0.4.1-1.1.noarch.rpm"
RPM_HASH = "973b1a2b1af7da4a92cf73e55a444a37f12efec874716dd143d91075cd93aa6ddfb6eb577b960291c378facd3e9dd4576a9ed52b1fb1afd7922787e5edbc5b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-scm-bridge"
RDEPENDS:${PN} += "/usr/bin/python3 \
build \
perl(Date::Parse) \
perl(LWP::UserAgent) \
perl(Net::SSL) \
perl(Pod::Usage) \
perl(Time::Zone) \
perl(URI) \
perl(XML::Parser) \
perl(YAML::LibYAML)"

inherit rpm
