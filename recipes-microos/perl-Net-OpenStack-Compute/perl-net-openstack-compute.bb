SUMMARY = "Bindings for the OpenStack Compute API"
DESCRIPTION = "This class is an interface to the OpenStack Compute API. Also see the the \
oscompute manpage command line tool."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.1200"

RPM_NAME = "perl-Net-OpenStack-Compute-1.1200-1.22.noarch.rpm"
RPM_HASH = "4f26ded3dca5f4ccbaef5bcce004e8448b0f50ff99938c613a8b0ef3cc67b96a7a5deeaaddcd96297b865f9306609685947259c3e040d7b500de8a5679bf296e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::OpenStack::Compute) perl(Net::OpenStack::Compute::AuthRole) perl-Net-OpenStack-Compute"
RDEPENDS:${PN} += "/usr/bin/env perl(:MODULE_COMPAT_5.36.0) perl(App::Rad) perl(App::Rad::Plugin::MoreHelp) perl(HTTP::Request) perl(JSON) perl(LWP) perl(Moose) perl(Test::Most)"

inherit rpm
