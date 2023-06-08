SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python39-yq-3.2.1-1.1.noarch.rpm"
RPM_HASH = "c303a0b18bf33e3945881a00e969d42ff4677c1b248c89551b26011e3ccecd8e857e6b48294e3ceb1cf043e38c4ccb60008a3132d2aca01a7a49cc02428bb215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yq) python39-yq python3dist(yq)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 jq python(abi) python39-PyYAML python39-argcomplete python39-tomlkit python39-xmltodict update-alternatives"

inherit rpm
