SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python310-ged4py-0.1.12-1.14.noarch.rpm"
RPM_HASH = "b6bcd96ffc73219e7d403996c8fab2c8bd2788725002da9ce2566d3cfb50a8538c4545b117a2803cc1a55a761d78fd458ea732ab10284e4d88356105ea69ff8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ged4py \
python3.10dist(ged4py) \
python310-ged4py \
python3dist(ged4py)"
RDEPENDS:${PN} += "python(abi) \
python310-ansel"

inherit rpm
