SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python311-enrich-1.2.7-2.1.noarch.rpm"
RPM_HASH = "ba47f16999126f2dfcbdd273a8ded841cb1494bd5bd647331a9d56a297064e29242246318ef57aae3426179e776f981f779edab56ac5ce712773b7e410fc6c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(enrich) python311-enrich python3dist(enrich)"
RDEPENDS:${PN} += "python(abi) python3.11dist(rich)"

inherit rpm
