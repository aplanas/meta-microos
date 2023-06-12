SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python311-taskw-2.0.0-1.3.noarch.rpm"
RPM_HASH = "452ea5f744de557d74860e1b1ef4c3d2f78149e85ed3429d21cc94ab1d7a5dbc1f8670cdffc53a30e3f89474db92adcdaaf65104d72fb87a6b57920ec8c57169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(taskw) \
python311-taskw \
python3dist(taskw)"
RDEPENDS:${PN} += "python(abi) \
python311-kitchen \
python311-python-dateutil \
python311-pytz \
taskwarrior"

inherit rpm
