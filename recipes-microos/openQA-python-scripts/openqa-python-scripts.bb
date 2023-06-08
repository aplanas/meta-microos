SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-python-scripts-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "84a2352202d7f87ebb863ba6235c6bfe540593f51d4dc39e2105ed89d7c21deb6e374fa39c47c768bb82b4be635c004b1bfe8f03349a8f577240e5faad05afa5"

RPROVIDES:${PN} += "openQA-python-scripts openQA-python-scripts(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 openQA-client python3-base python3-future python3-requests"

inherit rpm
