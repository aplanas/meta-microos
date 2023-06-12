SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-booleanOperations-0.9.0-2.7.noarch.rpm"
RPM_HASH = "1ec838ecb307841942ea4980e81dec449c8d365636fcf0d099d4d6a1182e67a1eaae7dde13ccbc2b1dbb97876834b3f5768c92629e014e9b10f7272c1e29b6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(booleanoperations) \
python311-booleanOperations \
python3dist(booleanoperations)"
RDEPENDS:${PN} += "python(abi) \
python311-FontTools \
python311-pyclipper"

inherit rpm
