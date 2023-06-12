SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python39-freezegun-1.2.2-2.1.noarch.rpm"
RPM_HASH = "f74bb1fab2f9ace4434a6e448cd100f2fb4e9a054d24559c862d003999541214e9434b33a9a07b2efd498d2cb35a538609d2fd1b70eb2acc0bf83b60c15befac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(freezegun) \
python39-freezegun \
python3dist(freezegun)"
RDEPENDS:${PN} += "python(abi) \
python39 \
python39-python-dateutil"

inherit rpm
