SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "1.124"

RPM_NAME = "python39-copr-1.124-1.5.noarch.rpm"
RPM_HASH = "ecbfee6ace2e76da21538e48a43e14694edbd181d75b7a962c8a3eaf70c4809716f91092fd6a9e1e58c99efd17ad8939fe02cb48b7cb5885238f7f43d48fb050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(copr) python39-copr python3dist(copr)"
RDEPENDS:${PN} += "python(abi) python39-marshmallow python39-munch python39-requests python39-requests-toolbelt"

inherit rpm
