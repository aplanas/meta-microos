SUMMARY = "Simple mock test library using RAII."
DESCRIPTION = "Test::Mock::Guard is mock test library using RAII. This module is able to \
change method behavior by each scope. See SYNOPSIS's sample code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Test-Mock-Guard-0.10-1.15.noarch.rpm"
RPM_HASH = "c357cba5c4339b7e288d2061d56acfe8067dcdeb9703db282bc5ba628a1d09ae3919a945eb9d1c5dc207b43512a3e91157d3e77618b274b9cccff36e465d73ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Mock::Guard) perl-Test-Mock-Guard"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Class::Load) perl(Exporter)"

inherit rpm
