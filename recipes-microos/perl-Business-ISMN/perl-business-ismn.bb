SUMMARY = "Work with International Standard Music Numbers"
DESCRIPTION = "work with International Standard Music Numbers"
LICENSE = "Artistic-2.0"

PV = "1.203"

RPM_NAME = "perl-Business-ISMN-1.203-1.1.noarch.rpm"
RPM_HASH = "b427e614943ee6ae291a953c1ea2c8ac819f80a2d1998d5ff4b85ec17e25ffd225f2cbcac9f921297fba371b2701d41374e54dd742015e50d7d6b7628f9418e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Business::ISMN) perl(Business::ISMN::Data) perl-Business-ISMN"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Tie::Cycle)"

inherit rpm
