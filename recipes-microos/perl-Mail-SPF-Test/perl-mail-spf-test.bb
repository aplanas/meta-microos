SUMMARY = "SPF test-suite class"
DESCRIPTION = "  *Mail::SPF::Test* is a class for reading and manipulating SPF test-suite \
  data."
LICENSE = "BSD-3-Clause"

PV = "1.001"

RPM_NAME = "perl-Mail-SPF-Test-1.001-8.24.noarch.rpm"
RPM_HASH = "52248ffd2c323b2ed9787d81af8a6ebedfd8385f25b95df67456a40f014ab560f642eb1ac323400c0cd3ef449e6a7c6c075d5e98194f79986882d374aa6797ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mail::SPF::Test) perl(Mail::SPF::Test::Base) perl(Mail::SPF::Test::Case) perl(Mail::SPF::Test::Scenario) perl-Mail-SPF-Test"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Net::DNS) perl(NetAddr::IP) perl(YAML) perl(version)"

inherit rpm
