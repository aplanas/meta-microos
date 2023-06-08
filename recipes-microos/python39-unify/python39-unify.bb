SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-unify-0.5-2.13.noarch.rpm"
RPM_HASH = "dae7796b0b7f7a08acb550c42b67e0acda963d68ad434f41df1721e3a0e94a08f1f7babe65991f84f28fa19f15109997bfd04fdb71983149148abea691c821ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(unify) python39-unify python3dist(unify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools python39-untokenize update-alternatives"

inherit rpm
