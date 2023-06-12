SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-serial-22.10.0-6.1.noarch.rpm"
RPM_HASH = "fad216919f640657464eceb933a77cdc21c4bb3eb228f3c305082635d83cc40384634bce22c1754212915a226cf5fa1958f76609842a38e466ade92563a9d0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-serial"
RDEPENDS:${PN} += "python311-Twisted \
python311-pyserial"

inherit rpm
