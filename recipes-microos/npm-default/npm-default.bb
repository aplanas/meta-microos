SUMMARY = "Default version of npm"
DESCRIPTION = "Depends on the npm version associated with the current default \
version of nodejs for the current architecture and codestream."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "npm-default-5.1-1.2.aarch64.rpm"
RPM_HASH = "2237ca3a5229e3927821b1e78128ddb27436b3c0636e92f0dc20e0782facc9a89688d45d7512bc360109540b6b29cd9c91ce72370128f849eddb6b41b5bf021a"

RPROVIDES:${PN} += "npm npm-default npm-default(aarch-64)"
RDEPENDS:${PN} += "nodejs-default npm19"

inherit rpm
