SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python39-url-normalize-1.4.3-2.1.noarch.rpm"
RPM_HASH = "16753a15c9f1838fdb91d968bb55e49a2aee7c286ba9179615a7c31e042895da5ed420375aa96675a00592480b668c1c97883e32bed69e3ba008899f9482da04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(url-normalize) python39-url-normalize python39-url_normalize python3dist(url-normalize)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
