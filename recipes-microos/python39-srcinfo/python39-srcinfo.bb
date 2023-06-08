SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.1"

RPM_NAME = "python39-srcinfo-0.1.1-1.4.noarch.rpm"
RPM_HASH = "45dad1db239ecf97cda5417c56ce7f7aec36535f3f46a9361d8736ef6cbe5eb60d944e3711cc513bd1b4d184a40c8917ba9bf5a137db484f91fbeba59ddbb7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(srcinfo) python39-srcinfo python3dist(srcinfo)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-parse update-alternatives"

inherit rpm
