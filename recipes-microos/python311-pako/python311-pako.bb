SUMMARY = "The universal package manager library"
DESCRIPTION = "Often, scripts need to install system dependencies using the native package \
manager of the user's OS. Typically, this is solved by having some bash script \
that runs apt-get, assuming the user is on Ubuntu. Smarter scripts use hand \
crafted code to detect the user's platform and aggregate a set of dependencies \
on a few of the more popular platforms. Our approach is different: \
  * Parse package format (devel/debug/normal library or executable) \
  * Look up package managers that exist in PATH \
  * Format parsed package with common package convention of package manager \
 \
More on https://github.com/MycroftAI/pako"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python311-pako-0.3.1-1.4.noarch.rpm"
RPM_HASH = "2f540a7f917a369548039fab2821ff27f62ef0c17e52cdb2454ddb989473d32dae47942184889567daea6f11017d029a5eb8ced13644a0df74856891c809b86a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pako) python311-pako python3dist(pako)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-appdirs update-alternatives"

inherit rpm
