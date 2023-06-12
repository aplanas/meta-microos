SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-pyflakes-3.0.1-4.1.noarch.rpm"
RPM_HASH = "4b718dce04cc5917e534e8d50c70a8a4bccd87497b07d8d5cace18aa7c3d53d75e04c089ee739fabf1428942e42e7d632c44c92048e5c52f81c580befecbde6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyflakes \
python3.10dist(pyflakes) \
python310-pyflakes \
python3dist(pyflakes)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
