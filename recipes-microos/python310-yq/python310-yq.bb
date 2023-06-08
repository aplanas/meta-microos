SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python310-yq-3.2.1-1.1.noarch.rpm"
RPM_HASH = "3f3faceef5d94079f8877135be7f9791a72d3d4adcfff00e618884cad87efd28c8f6883b167e7841d03302a1766356f91fa945a02e3c16f20210f75bba1f7cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yq python3.10dist(yq) python310-yq python3dist(yq)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 jq python(abi) python310-PyYAML python310-argcomplete python310-tomlkit python310-xmltodict update-alternatives"

inherit rpm
