SUMMARY = "Recursively create a directory tree"
DESCRIPTION = "This module was extracted from several near-identical copies used in the \
tests of some of my CPAN distributions."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "perl-File-TreeCreate-0.0.1-1.8.noarch.rpm"
RPM_HASH = "a2c12fbcc42bfa8a06c605b381de285ff44a431d86445ed0c3027cf0172c0beabc167015122a60979fae9232df79f4c52783993804e72ba3c8106e3c3599ff68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::TreeCreate) perl-File-TreeCreate"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(autodie)"

inherit rpm
