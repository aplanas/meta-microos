SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python39-atpublic-3.1.1-2.2.noarch.rpm"
RPM_HASH = "22847aed7779bf9e60d21fbd10a37823981c7117ffec0b0785336e6d7f0197a322e22948ecce6b0fb0c5ca0fc9bb584b5443eefbd40994a5481224c038871cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(atpublic) \
python39-atpublic \
python3dist(atpublic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
