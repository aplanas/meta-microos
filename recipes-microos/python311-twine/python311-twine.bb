SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python311-twine-4.0.2-1.1.noarch.rpm"
RPM_HASH = "40339da2bfb45d7fc19891196840d3b058f5a4f7ddc6d32991fafbb595ed39300284d0f7a51fb9be98afe209560261ed7cf4cd19e914f738acd9998a6a2b4826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(twine) \
python311-twine \
python3dist(twine)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-importlib-metadata \
python311-keyring \
python311-pkginfo \
python311-readme_renderer \
python311-requests \
python311-requests-toolbelt \
python311-rfc3986 \
python311-rich \
update-alternatives"

inherit rpm
