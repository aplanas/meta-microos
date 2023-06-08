SUMMARY = "Python module to validate VAT numbers"
DESCRIPTION = "Python module to validate VAT numbers."
LICENSE = "GPL-3.0-only"

PV = "1.2"

RPM_NAME = "python311-vatnumber-1.2-4.5.noarch.rpm"
RPM_HASH = "26ca018a4a04415a21403deb683c2ec6181ef52845d33f7a4eedcf2b86762df2a9bcd5d569a6a18830cd2ac2bb944b3eedc07fe29b6b9c6f572f770d4f611c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-vatnumber"
RDEPENDS:${PN} += "python311-python-stdnum python311-six"

inherit rpm
