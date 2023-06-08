SUMMARY = "Allows conversion between Roman and Arabic algarisms."
DESCRIPTION = "This package supports both conventional Roman algarisms (which range from \
_1_ to _3999_) and Milhar Romans, a variation which uses a bar across the \
algarism to indicate multiplication by _1_000_. For the purposes of this \
module, acceptable syntax consists of an underscore suffixed to the \
algarism e.g. IV_V = _4_005_. The term Milhar apparently derives from the \
Portuguese word for 'thousands' and the range of this notation extends the \
range of Roman numbers to _3999 * 1000 + 3999 = 4_002_999_. \
 \
Note: the functions in this package treat Roman algarisms in a \
case-insensitive manner such that 'VI' == 'vI' == 'Vi' == 'vi'. \
 \
The following functions may be imported into the caller package by name:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.5"

RPM_NAME = "perl-Text-Roman-3.5-1.24.noarch.rpm"
RPM_HASH = "092ca31f7ba0f0ed67f8dcbf552c60a8cd345fa83774cf3641308cd4b4f7b364e8a6c9c6c1468742eff36698d22b00bac18aa751d71fe09e6264e3e93d302273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Roman) perl-Text-Roman"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
