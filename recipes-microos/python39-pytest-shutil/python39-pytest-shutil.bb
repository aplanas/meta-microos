SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-shutil-1.7.0-6.3.noarch.rpm"
RPM_HASH = "7cfafb03af59fdcb5ea2fa32f13c0ab4d93271cad63d6ffbacb4225c73bea325df6bd7b709c3653af07b3105249fd45411d1bfe14ffc0c0b47a3097881f35fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-shutil) python39-pytest-shutil python3dist(pytest-shutil)"
RDEPENDS:${PN} += "python(abi) python39-execnet python39-path python39-pytest python39-six python39-termcolor"

inherit rpm
