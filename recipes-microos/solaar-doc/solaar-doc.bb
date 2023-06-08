SUMMARY = "Documentation for solaar"
DESCRIPTION = "Solaar will detect all devices paired with your Unifying Receiver, and \
at the very least display some basic information about them. \
 \
For some devices, extra settings (usually not available through the \
standard Linux system configuration) are supported. For a full list of \
supported devices and their features, see docs/devices.md."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "solaar-doc-1.1.9-1.1.noarch.rpm"
RPM_HASH = "b7a8309825ed47c580c98797cf2e3c69966e0768c79ee2f23d1b5b74179d39538155abf04a6abf018fd31e9ad503b28890c242105dc8fa62be2ee9672378777d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solaar-doc"
RDEPENDS:${PN} += ""

inherit rpm
