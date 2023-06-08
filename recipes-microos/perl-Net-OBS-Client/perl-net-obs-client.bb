SUMMARY = "Simple OBS API calls"
DESCRIPTION = "Net::OBS::Client aims to simplify usage of OBS \
(https://openbuildservice.org) API calls in perl."
LICENSE = "Artistic-2.0"

PV = "0.0.8"

RPM_NAME = "perl-Net-OBS-Client-0.0.8-1.10.noarch.rpm"
RPM_HASH = "3f3ad6735d77ececc2a252f82d3a2ee5e74242b1efa88dcdf2b33386a12b38982dc1d7f0c5cf94ba33a14836daa24049757121c69ae7c19d8a1b251d669d2c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::OBS::Client) perl(Net::OBS::Client::BuildResults) perl(Net::OBS::Client::DTD) perl(Net::OBS::Client::Package) perl(Net::OBS::Client::Project) perl(Net::OBS::Client::Roles::BuildStatus) perl(Net::OBS::Client::Roles::Client) perl-Net-OBS-Client"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Config::INI::Reader) perl(Config::Tiny) perl(HTTP::Cookies) perl(HTTP::Request) perl(LWP::UserAgent) perl(Moose) perl(Moose::Role) perl(Path::Class) perl(URI::URL) perl(XML::Structured)"

inherit rpm
