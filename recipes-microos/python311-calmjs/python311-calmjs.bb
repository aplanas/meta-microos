SUMMARY = "A Python framework for working with the Node.js ecosystem"
DESCRIPTION = "A Python framework for building toolchains and utilities for working \
with the Node.js ecosystem from within a Python environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python311-calmjs-3.4.4-1.1.noarch.rpm"
RPM_HASH = "b8052028f771674521561e93174405e890c53808721c2a47207c294600534a8c07c7ffbb058f7b0262051114e65ce86605f9b35eb051ec85164dfbdfb4d83c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(calmjs) \
python311-calmjs \
python3dist(calmjs)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-calmjs.parse \
python311-calmjs.types \
update-alternatives"

inherit rpm
