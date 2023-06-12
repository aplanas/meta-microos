SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-gscholar-2.1.0-1.4.noarch.rpm"
RPM_HASH = "ebe6d87994748a84f02eea16297e6bb69c8922ceac683d4b6beece8d285e13ef04e59d9b7b1988d25b2182121923eb344f92b7a73bc28c280122513dced8b2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gscholar) \
python311-gscholar \
python3dist(gscholar)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
