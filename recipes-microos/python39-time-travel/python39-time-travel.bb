SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-time-travel-1.1.2-3.5.noarch.rpm"
RPM_HASH = "ca7b1702485abbbf0f17f994a5b1eac439993ea165f9b2a9de17a14e37b4c49274dfd2f096aec299bea6bacf29223b4933953e0c0316faa8b48743f84f0d6972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(time-travel) \
python39-time-travel \
python3dist(time-travel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
