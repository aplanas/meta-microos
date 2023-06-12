SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-pytest-describe-2.1.0-1.1.noarch.rpm"
RPM_HASH = "094bc487d6637bd75b2542b8318d3f2aa52a03afb336b92a4435733028d898b7bbb1afea2c33549ebb014e442e07cfb27c883286708bd56bcc6768e90f9579f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-describe \
python3.10dist(pytest-describe) \
python310-pytest-describe \
python3dist(pytest-describe)"
RDEPENDS:${PN} += "python(abi) \
python310-py \
python310-pytest"

inherit rpm
