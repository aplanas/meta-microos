SUMMARY = "Perl bindings for subunit"
DESCRIPTION = "Subunit Perl bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "perl-subunit-1.4.2-2.2.noarch.rpm"
RPM_HASH = "e7507ed27cca99a8a6fe2c4b642b32a6222f4ac148256d566d68f54a6ae5c993ba344ebe092c0c4869dac87d76927a6f59baf1ac22b2453293c2ae78f0c2cbe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Subunit) \
perl(Subunit::Diff) \
perl-subunit"
RDEPENDS:${PN} += "/usr/bin/perl \
perl-base"

inherit rpm
