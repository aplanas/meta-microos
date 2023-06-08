SUMMARY = "Two letter codes for state identification in the United States and vice versa"
DESCRIPTION = "Two letter codes for state identification in the United States and vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.04"

RPM_NAME = "perl-Locale-US-3.04-1.26.noarch.rpm"
RPM_HASH = "79eaf8822b70313df08ea57af705ff49dec09347b480a0e4ff93ab00bf6e09785f15f334c761168732ead32e07d8e228773311958fc1b5478ca38861b4a4d3f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Locale::US) perl-Locale-US"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Data::Section::Simple)"

inherit rpm
