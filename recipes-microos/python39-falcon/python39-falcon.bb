SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python39-falcon-3.1.1-1.4.noarch.rpm"
RPM_HASH = "fae7c8a97dcdbb645d07d318ae38dec888839d2f0dd16bb15157ca350c376d3ae2a955bd2da47ab58f233efff1acb4b309c3f37ff1f2c893ffedc653e0289db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(falcon) \
python39-falcon \
python3dist(falcon)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
