SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python311-case-1.5.3-7.3.noarch.rpm"
RPM_HASH = "9ca12c82dacf7f71d1fc210f2b125127d1a2fa8718c7090b6309ebf928fad5670997e1581c7b3093347e8177e106c4f61e8695b201bcb764c7ccaa0c205aee68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(case) python311-case python3dist(case)"
RDEPENDS:${PN} += "python(abi) python311-pytest python311-setuptools python311-six"

inherit rpm
