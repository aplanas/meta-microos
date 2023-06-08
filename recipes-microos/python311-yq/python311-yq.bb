SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python311-yq-3.2.1-1.1.noarch.rpm"
RPM_HASH = "6c87e289a3810d1e1b84307c9c4e07c491c0a2f44f62db9782fac4be0bd7a4339dde1e5979ed0cfba3935c39a27e23aaef6020a94364d0c856a074c1018ed269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yq) python311-yq python3dist(yq)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 jq python(abi) python311-PyYAML python311-argcomplete python311-tomlkit python311-xmltodict update-alternatives"

inherit rpm
