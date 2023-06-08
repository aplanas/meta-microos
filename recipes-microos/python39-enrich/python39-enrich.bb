SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python39-enrich-1.2.7-2.1.noarch.rpm"
RPM_HASH = "a53c0af3ba00055ecc59106b8a2647b478b1e286af4e83a013a9477ec68f7029e8fc52f807cab8795df6c297e117cf31dbdefdf632ad94dc95d52e9712fb739d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(enrich) python39-enrich python3dist(enrich)"
RDEPENDS:${PN} += "python(abi) python3.9dist(rich)"

inherit rpm
