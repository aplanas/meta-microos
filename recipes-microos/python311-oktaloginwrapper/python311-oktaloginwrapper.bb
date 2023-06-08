SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-oktaloginwrapper-0.2.2-2.8.noarch.rpm"
RPM_HASH = "197392f2bf968cb50ae79d56f1e0f934985c6cb7da9c72959d7d2728cadd4cbddf00ed90af196a01af67b999edf00a754d6f0ef498c860eb8d1cf59fdb277a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(oktaloginwrapper) python311-oktaloginwrapper python3dist(oktaloginwrapper)"
RDEPENDS:${PN} += "python(abi) python311-lxml python311-requests"

inherit rpm
