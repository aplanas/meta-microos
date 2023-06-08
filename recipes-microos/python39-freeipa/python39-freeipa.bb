SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python39-freeipa-1.0.6-1.8.noarch.rpm"
RPM_HASH = "71b8135bfade9245279091dcce6146d73210a3b30c79edd5f9c74eaa79593e138a1989f3cd465cfbd8ebc532f4e86cc55493805ebd9e83f7a615422153d5380d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-freeipa) python39-freeipa python3dist(python-freeipa)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
