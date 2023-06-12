SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python311-pytest-check-links-0.8.0-1.2.noarch.rpm"
RPM_HASH = "89b863c66d2c955ef5963214b087f5ce82107a8820f62fda2f52d646264e7431607c44b49f4f906810304baa6b2d0d57f2d341306f85f75f4aa5744a3cc93097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-check-links) \
python311-pytest-check-links \
python3dist(pytest-check-links)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-docutils \
python311-html5lib \
python311-pytest \
python311-requests \
update-alternatives"

inherit rpm
