SUMMARY = "Parse directory listing"
DESCRIPTION = "This module exports a single function called 'parse_dir', which can be used \
to parse directory listings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.15"

RPM_NAME = "perl-File-Listing-6.15-1.6.noarch.rpm"
RPM_HASH = "2199fe2b77feb253860d8928fae3d9f1e0e5178b738018109546af02ccb2d330ea5890932e7811e558fac6c9bcb9a408ce55458913e873ed96ee18d216a69e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Listing) perl(File::Listing::apache) perl(File::Listing::dosftp) perl(File::Listing::netware) perl(File::Listing::unix) perl(File::Listing::vms) perl-File-Listing"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Date)"

inherit rpm
