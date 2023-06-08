SUMMARY = "Client tools for remote openQA management"
DESCRIPTION = "Tools and support files for openQA client script. Client script is \
a convenient helper for interacting with openQA webui REST API."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-client-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "c818f00ef142fea33b2ae8ab6ea733547626f3ae81594f7e655039a092c1eb9e6d79978ccfda713643c5b8ea4806623940468e0d758adecaceb8ac50e742c580"

RPROVIDES:${PN} += "openQA-client openQA-client(aarch-64) perl(OpenQA::Client) perl(OpenQA::Client::Archive) perl(OpenQA::Client::Handler) perl(OpenQA::Client::Upload) perl(OpenQA::UserAgent)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/perl curl git-core jq openQA-common perl(Getopt::Long::Descriptive) perl(IO::Socket::SSL) perl(IPC::Run) perl(JSON::Validator) perl(LWP::Protocol::https) perl(LWP::UserAgent) perl(Test::More) perl(YAML::PP) perl(YAML::XS)"

inherit rpm
