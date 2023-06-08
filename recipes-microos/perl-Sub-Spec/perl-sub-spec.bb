SUMMARY = "Subroutine metadata specification"
DESCRIPTION = "Subroutine metadata specification"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0.7"

RPM_NAME = "perl-Sub-Spec-1.0.7-9.25.noarch.rpm"
RPM_HASH = "08e904740a356d12101f0aad3179afbc09f67e7445845ebfa0663446f7bc68cfa43bd39cf0f90cd4ca1b5a5918f53347d484c330c101a9ed93eaf9a8f3a2c230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sub::Spec) perl(Sub::Spec::Schema) perl(Sub::Spec::Util) perl-Sub-Spec"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(File::Which) perl(Log::Any) perl(Probe::Perl) perl(Test::More)"

inherit rpm
