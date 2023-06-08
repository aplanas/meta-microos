SUMMARY = "GDTextUtil Perl module"
DESCRIPTION = "GDTextUtil Perl module"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.86"

RPM_NAME = "perl-GDTextUtil-0.86-99.18.noarch.rpm"
RPM_HASH = "771108e65ab64b45563f907e8413c18a4a31d8683779819cf2552a835f05ab1485f570ff6af04a7130f3b13ffaa0675b0be9f012d3c3b40a512d7458e78a647f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(GD::Text) perl(GD::Text::Align) perl(GD::Text::Wrap) perl-GDTextUtil"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(GD)"

inherit rpm
