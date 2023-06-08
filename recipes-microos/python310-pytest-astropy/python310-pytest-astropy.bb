SUMMARY = "Meta-package containing dependencies for testing"
DESCRIPTION = "This is a meta-package that pulls in the dependencies that are used by \
astropy and some affiliated packages for testing. It can also be used for \
testing packages that are not affiliated with the Astropy project. \
 \
This package also provides pytest markers for cpu and memory intensive tests \
(`pytest.mark.slow` and `pytest.mark.hugemem`). Tests marked with those \
markers are not run by default, can be run with the other tests with \
`--run-slow` and `--run-hugemem`, and can be run separately with `-m slow` \
and `-m hugemem`."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python310-pytest-astropy-0.10.0-1.5.noarch.rpm"
RPM_HASH = "37a6ec18d204811f822eb30567b8fb418bec05909d1615aa320385f43fcfe63e2dd9a14c7ba988952dfabcf972fdb1297861a8d40e64b394132d36781179bbbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-astropy python3.10dist(pytest-astropy) python310-pytest-astropy python3dist(pytest-astropy)"
RDEPENDS:${PN} += "python(abi) python310-attrs python310-hypothesis python310-pytest python310-pytest-arraydiff python310-pytest-astropy-header python310-pytest-cov python310-pytest-doctestplus python310-pytest-filter-subpackage python310-pytest-mock python310-pytest-openfiles python310-pytest-remotedata"

inherit rpm
