SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python39-ptpython-3.0.22-1.4.noarch.rpm"
RPM_HASH = "821b8ee07af4e5d11e7a37119df3e33d6d69cbee207c0efa9fdc71c8b818cc7f8f5c8f40ee8f9fb22bca54a8943a4c0168f01a9d5f59c30286b1c06e8a2ddd9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ptpython) \
python39-ptpython \
python3dist(ptpython)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Pygments \
python39-appdirs \
python39-docopt \
python39-jedi \
python39-prompt_toolkit"

inherit rpm
