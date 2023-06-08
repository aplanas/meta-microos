SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-conu-1.0.0-2.3.noarch.rpm"
RPM_HASH = "06256ea2b3083c68f8400c6b01b7f73971a73358b30dd1d6aa6d25fbf2fda0177d531d58f98203e9c2d9a2cf171151826bfbcd41217b5ce330e95a9ee68bd968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-conu python3.10dist(conu) python310-conu python3dist(conu)"
RDEPENDS:${PN} += "python(abi) python310-docker python310-flexmock python310-kubernetes python310-pytest python310-requests"

inherit rpm
