SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-shutil-1.7.0-6.3.noarch.rpm"
RPM_HASH = "77541aa0803a3e848d1e481dcb76342d54f09ab2a247672efedf2d712f9eb57db723a061cebc534825a004afa1a1640ff5280a53af607ed3d0d95a91089183d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-shutil) python311-pytest-shutil python3dist(pytest-shutil)"
RDEPENDS:${PN} += "python(abi) python311-execnet python311-path python311-pytest python311-six python311-termcolor"

inherit rpm
