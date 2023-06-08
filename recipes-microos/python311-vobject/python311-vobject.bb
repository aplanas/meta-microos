SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.6.1"

RPM_NAME = "python311-vobject-0.9.6.1-2.19.noarch.rpm"
RPM_HASH = "707ca825c3507cd15ea4a6a0bb226c2239ca0a13b583368f617bbe6f70bd12d80c95d4a4b8b383accf372d1a4245e99526c15925765a3dc9c1e60518f96f0e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vobject) python311-vobject python3dist(vobject) vobject"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-python-dateutil python311-six update-alternatives"

inherit rpm
