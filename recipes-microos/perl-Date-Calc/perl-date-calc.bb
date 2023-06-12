SUMMARY = "Gregorian calendar date calculations"
DESCRIPTION = "* * \
 \
  'use Date::Calc qw( Days_in_Year Days_in_Month ... );' \
 \
* *"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "6.4"

RPM_NAME = "perl-Date-Calc-6.4-2.1.noarch.rpm"
RPM_HASH = "eee30af36ca73b8f70947b3bc9f222d25760119ef30eff3a61f408e448660bb98513fcc38df92afba6b4e396664abbb6994669b1be55a54a4cba5b45ec41c65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Date::Calc) \
perl(Date::Calc::Object) \
perl(Date::Calc::PP) \
perl(Date::Calendar) \
perl(Date::Calendar::Profiles) \
perl(Date::Calendar::Year) \
perl-Date-Calc"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Bit::Vector) \
perl(Carp::Clan)"

inherit rpm
