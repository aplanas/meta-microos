SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-pathable-0.4.3-2.1.noarch.rpm"
RPM_HASH = "0f492de6f43407ec58365cd4293fbbf0345489b98812df1d241d179d87d63118b87439fada00336caa9a5bd9c4b9d633f6ca78f08b8efe3bc5e4756f09af081a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pathable) python39-dictpath python39-pathable python3dist(pathable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
