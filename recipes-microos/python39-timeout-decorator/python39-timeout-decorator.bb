SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-timeout-decorator-0.5.0-1.1.noarch.rpm"
RPM_HASH = "37dc7934124f792b60b78bb37cb9af0695dbd8dc27facce07fe46c8f7dd4b01d8558fea146be861c5b40d77435e6cecf530dbe008e5e618c305f56ce7107af69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(timeout-decorator) python39-timeout-decorator python3dist(timeout-decorator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
