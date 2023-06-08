SUMMARY = "Module for reading .ini-style configuration files"
DESCRIPTION = "Config::IniFiles provides a way to have readable configuration files \
outside your Perl script. Configurations can be imported (inherited, \
stacked,...), sections can be grouped, and settings can be accessed from a \
tied hash."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.000003"

RPM_NAME = "perl-Config-IniFiles-3.000003-1.13.noarch.rpm"
RPM_HASH = "2c8101dcb3c8709f286ff56bcf37fff545f16d4d1b1f475698f9487acfc2754581e6edb6f6f774abbaa11e39e8ad7154e492915f2395973e89ccb3daa0ad160b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::IniFiles) perl(Config::IniFiles::_section) perl-Config-IniFiles"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(IO::Scalar) perl(List::Util)"

inherit rpm
