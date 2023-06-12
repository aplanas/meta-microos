SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-git-1.7.0-2.13.noarch.rpm"
RPM_HASH = "e7163e39af42b653cfa62f798d5b2ef6d1a0d35d33fd4ad38f577e0617a94ff8aabf91617ae93ae8e77c3763deb620cbb66cf2934b74c2fd45766f94340d5a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-git) \
python39-pytest-git \
python3dist(pytest-git)"
RDEPENDS:${PN} += "python(abi) \
python39-GitPython \
python39-pytest \
python39-pytest-shutil"

inherit rpm
