SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "21.0.0"

RPM_NAME = "python311-boltons-21.0.0-2.3.noarch.rpm"
RPM_HASH = "9208fca20eee18c95f045472f25ef5eec5b715223e33196f2ce62ab2ef0205e1f1f835b7d2a3d5087b710840f596d6b4dc7b7fa399b8123ceb643a5c1b4bad5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(boltons) \
python311-boltons \
python3dist(boltons)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
