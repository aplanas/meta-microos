SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "python311-progressbar2-4.2.0-2.2.noarch.rpm"
RPM_HASH = "c45d3dc85a499a64ec38bac71d88162072c6a266c8063b4edf8fd6184a9bdd29cc2c663d5f8073d255211150f88a3952b640ac9dbfbbe2b8d2e577f742aecef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(progressbar2) \
python311-progressbar2 \
python3dist(progressbar2)"
RDEPENDS:${PN} += "python(abi) \
python311-python-utils"

inherit rpm
