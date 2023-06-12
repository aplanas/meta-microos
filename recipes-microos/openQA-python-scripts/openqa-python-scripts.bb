SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-python-scripts-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "f4ea1534912c2d01f7b8fbdcca51198c2a80faf639f58520d9223e1640009d71857a134ca14fccbbf38b423a73e748aa242861daa7bcb81a1b55bcc677d765de"

RPROVIDES:${PN} += "openQA-python-scripts openQA-python-scripts(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 openQA-client python3-base python3-requests"

inherit rpm
