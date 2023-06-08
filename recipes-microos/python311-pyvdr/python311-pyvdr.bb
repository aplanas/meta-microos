SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-pyvdr-0.3.1-1.8.noarch.rpm"
RPM_HASH = "9a9f955cbc39b5d4b5e19b12ac11fda5edbe31405f646c92be760ffad4f9c0ee7cd269c882e9aaec5e1c843433668383829dafcd569298af465d32a6f0d871b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyvdr) python311-pyvdr python3dist(pyvdr)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
