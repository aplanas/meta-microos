SUMMARY = "This package provides two Hatch plugins for nodejs"
DESCRIPTION = "Hatch plugin to read pyproject.toml metadata from package.json \
 \
This package provides two Hatch plugins: \
 \
* version source plugin that reads/writes the package version \
  from the version field of the Node.js package.json file. \
* metadata hook plugin that reads PEP 621 metadata from the \
  Node.js package.json file."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-hatch_nodejs_version-0.3.1-2.3.noarch.rpm"
RPM_HASH = "39fd291d2e9d635f9a22465975b05e4025cf89b7d3c2c3c47dab4d5469f20171bb26b5151b694c2cc3a47795a421ccf0ecb2b4ff674818f419f281fa8447df52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatch-nodejs-version) \
python311-hatch-nodejs-version \
python311-hatch_nodejs_version \
python3dist(hatch-nodejs-version)"
RDEPENDS:${PN} += "python(abi) \
python311-hatchling"

inherit rpm
