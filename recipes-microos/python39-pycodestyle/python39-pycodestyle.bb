SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python39-pycodestyle-2.10.0-5.1.noarch.rpm"
RPM_HASH = "1575c1cf6bc05c4db9b07deb5f42fd376f1d1a9393925aa824a1d60a52e5699c7d790f124da58b7fadc36fd87666df530790d90ef25c245f3a22cdeddcea99da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pycodestyle) \
python39-pep8 \
python39-pycodestyle \
python3dist(pycodestyle)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
