SUMMARY = "Numeric comparisons"
DESCRIPTION = "Number::Compare compiles a simple comparison to an anonymous subroutine, \
which you can call with a value to be tested again. \
 \
Now this would be very pointless, if Number::Compare didn't understand \
magnitudes. \
 \
The target value may use magnitudes of kilobytes ('k', 'ki'), megabytes \
('m', 'mi'), or gigabytes ('g', 'gi'). Those suffixed with an 'i' use the \
appropriate 2**n version in accordance with the IEC standard: \
https://physics.nist.gov/cuu/Units/binary.html"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Number-Compare-0.03-11.6.noarch.rpm"
RPM_HASH = "9d1dcc99e90f2b3e666dc7e7921f5577b7062b969d98c16947a42f23c8ad63ad75e138e494287f5dfd3741733361dfb74e8e9011fe10fe954c459ce3320eabc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Number::Compare) perl-Number-Compare"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
