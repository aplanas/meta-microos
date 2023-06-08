SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-timeout-decorator-0.4.1-1.10.noarch.rpm"
RPM_HASH = "c64c442c2f5b6b02319e4dc408727d2aea9979f620500ab71fe056c4a8417d19c595685c94d3fe573709a40cfe04dbd536e6c58e07fcc3841846f0e034cc3fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-timeout-decorator python3.10dist(timeout-decorator) python310-timeout-decorator python3dist(timeout-decorator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
