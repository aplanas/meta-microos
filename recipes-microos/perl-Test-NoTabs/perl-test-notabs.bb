SUMMARY = "Check the presence of tabs in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of tabs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-NoTabs-2.02-1.17.noarch.rpm"
RPM_HASH = "000460bdb2ccc7d5cda8ffb13bc705b0e8cb57d1c9743ec6fd2a86daf4764f205e65934e96ec8aeddba59522a1b2aea6d0f60b60408a723fc772aee0b002dc1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::NoTabs) perl-Test-NoTabs"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
