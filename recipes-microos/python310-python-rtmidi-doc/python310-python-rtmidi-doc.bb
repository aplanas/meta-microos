SUMMARY = "HTML documentation and examples for python-rtmidi"
DESCRIPTION = "Contains HTML documentation and examples for python-rtmidi."
LICENSE = "MIT"

PV = "1.4.9"

RPM_NAME = "python310-python-rtmidi-doc-1.4.9-2.4.noarch.rpm"
RPM_HASH = "327365b3730cd487460fa20eecd6f866fad1737a3101d70ef0e1fddfa3a112cce13d49877ebcbf8b72eb71996639073bf55a631ea45dc1e0ff26a6c473f19d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-rtmidi-doc python310-python-rtmidi-doc"
RDEPENDS:${PN} += ""

inherit rpm
