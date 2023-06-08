SUMMARY = "Produce Tied (and Other) Separate but Combined Variables"
DESCRIPTION = "produce tied (and other) separate but combined variables"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.005"

RPM_NAME = "perl-IO-TieCombine-1.005-1.26.noarch.rpm"
RPM_HASH = "14e73dd02047322eb6e444b4f25c6cbf1aca4f8e8be61fc7cb69063b4568625c3cb830fc06d53710b0f30fb3f4006321aa40be0939d0f6ab85c692210d88be7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::TieCombine) perl(IO::TieCombine::Handle) perl(IO::TieCombine::Scalar) perl-IO-TieCombine"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
