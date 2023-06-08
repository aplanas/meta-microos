SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-svn-1.7.0-1.15.noarch.rpm"
RPM_HASH = "2eb2a541988324f2d49a9cdc077c85b347970c8cc3e7f20bd85d46ac21dcf61bb9d7431c60df3fc6e178cc27f2361418c7b34e60774bf06db61e47103442c77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-svn) python311-pytest-svn python3dist(pytest-svn)"
RDEPENDS:${PN} += "python(abi) python311-pytest python311-pytest-shutil subversion"

inherit rpm
