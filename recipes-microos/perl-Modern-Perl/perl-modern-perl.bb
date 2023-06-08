SUMMARY = "Enable all of the features of Modern Perl with one import"
DESCRIPTION = "enable all of the features of Modern Perl with one import"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230106"

RPM_NAME = "perl-Modern-Perl-1.20230106-1.1.noarch.rpm"
RPM_HASH = "3dbba6ba6231d808c1cbb8d23acf1b4097c56257cb01a8caa1fd04b6309ec633c4708d82713361470e2c87be2b697ef4697247b63f3148c81b1c23fa38af7d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Modern::Perl) perl(odern::Perl) perl-Modern-Perl"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(feature) perl(mro)"

inherit rpm
