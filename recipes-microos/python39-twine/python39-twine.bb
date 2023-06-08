SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python39-twine-4.0.2-1.1.noarch.rpm"
RPM_HASH = "8166f84373e8f64b5edb137884919abec8cbcfb733eab4d809269c4bbbdd344de496dc9c02325284a6750323e1619df60a00329789e2ce1e751e19f25418941e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(twine) python39-twine python3dist(twine)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-importlib-metadata python39-keyring python39-pkginfo python39-readme_renderer python39-requests python39-requests-toolbelt python39-rfc3986 python39-rich update-alternatives"

inherit rpm
