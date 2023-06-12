SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-click-log-0.4.0-1.6.noarch.rpm"
RPM_HASH = "5ab886803176e5ad17509a24fcd4dab0c173ab90263efe449a8baa403ff93444e86480d58cddcfffd89c4e0847ffbeb5e7d1da505fb60efd4cc79b459390d333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-log) \
python311-click-log \
python3dist(click-log)"
RDEPENDS:${PN} += "python(abi) \
python311-click"

inherit rpm
