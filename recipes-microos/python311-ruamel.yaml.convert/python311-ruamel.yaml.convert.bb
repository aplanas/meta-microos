SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-ruamel.yaml.convert-0.3.2-1.14.noarch.rpm"
RPM_HASH = "1ce65539efd034325b04e6e02bed8302c4d2659b04bcf0ea85be210074784d1b19da6786078c3100165611b04c8381ae438c370f1d1bd908073ac61d86e0c30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ruamel.yaml.convert) python311-ruamel.yaml.convert python3dist(ruamel.yaml.convert)"
RDEPENDS:${PN} += "python(abi) python311-python-dateutil python311-ruamel.base python311-ruamel.yaml"

inherit rpm
