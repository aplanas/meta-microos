SUMMARY = "Perl extension to generate and test check digits"
DESCRIPTION = "Perl extension to generate and test check digits"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.3.6"

RPM_NAME = "perl-Algorithm-CheckDigits-1.3.6-1.8.noarch.rpm"
RPM_HASH = "05e35cd1061ad37d525daae4a62b5ce530b397de773d002bbc44765da2eb496a3723668b62067dc29f1f04b48021c2484d11d85729b64ade112c3cd55acfdf56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Algorithm::CheckDigits) \
perl(Algorithm::CheckDigits::M07_001) \
perl(Algorithm::CheckDigits::M09_001) \
perl(Algorithm::CheckDigits::M10_001) \
perl(Algorithm::CheckDigits::M10_002) \
perl(Algorithm::CheckDigits::M10_003) \
perl(Algorithm::CheckDigits::M10_004) \
perl(Algorithm::CheckDigits::M10_005) \
perl(Algorithm::CheckDigits::M10_006) \
perl(Algorithm::CheckDigits::M10_008) \
perl(Algorithm::CheckDigits::M10_009) \
perl(Algorithm::CheckDigits::M10_010) \
perl(Algorithm::CheckDigits::M10_011) \
perl(Algorithm::CheckDigits::M11_001) \
perl(Algorithm::CheckDigits::M11_002) \
perl(Algorithm::CheckDigits::M11_003) \
perl(Algorithm::CheckDigits::M11_004) \
perl(Algorithm::CheckDigits::M11_006) \
perl(Algorithm::CheckDigits::M11_007) \
perl(Algorithm::CheckDigits::M11_008) \
perl(Algorithm::CheckDigits::M11_009) \
perl(Algorithm::CheckDigits::M11_010) \
perl(Algorithm::CheckDigits::M11_011) \
perl(Algorithm::CheckDigits::M11_012) \
perl(Algorithm::CheckDigits::M11_013) \
perl(Algorithm::CheckDigits::M11_015) \
perl(Algorithm::CheckDigits::M11_016) \
perl(Algorithm::CheckDigits::M11_017) \
perl(Algorithm::CheckDigits::M16_001) \
perl(Algorithm::CheckDigits::M23_001) \
perl(Algorithm::CheckDigits::M23_002) \
perl(Algorithm::CheckDigits::M43_001) \
perl(Algorithm::CheckDigits::M89_001) \
perl(Algorithm::CheckDigits::M97_001) \
perl(Algorithm::CheckDigits::M97_002) \
perl(Algorithm::CheckDigits::MBase_001) \
perl(Algorithm::CheckDigits::MBase_002) \
perl(Algorithm::CheckDigits::MBase_003) \
perl(Algorithm::CheckDigits::MXX_001) \
perl(Algorithm::CheckDigits::MXX_002) \
perl(Algorithm::CheckDigits::MXX_003) \
perl(Algorithm::CheckDigits::MXX_004) \
perl(Algorithm::CheckDigits::MXX_005) \
perl(Algorithm::CheckDigits::MXX_006) \
perl-Algorithm-CheckDigits"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(version)"

inherit rpm
