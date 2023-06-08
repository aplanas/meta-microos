SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-timeout-decorator-0.4.1-1.10.noarch.rpm"
RPM_HASH = "35fdc687bcb85e496c79108423e75b2b827f910b599cd5af53eb8dae9091a7af6739114c7c847802e1b30e389917e81a6da09be0ed407e0e0687e92a404f6914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(timeout-decorator) python311-timeout-decorator python3dist(timeout-decorator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
