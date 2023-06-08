SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-screeninfo-0.8.1-1.3.noarch.rpm"
RPM_HASH = "954c9d27ed09ef838ba3b9ceb191bf1e580f045cd14a4f27c036359a3a1df4d58f2f9f9e9b081e1bb5d0536460d142d68b2bb05547215bb7c65aade18382e91d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(screeninfo) python39-screeninfo python3dist(screeninfo)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
