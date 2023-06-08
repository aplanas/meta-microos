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

RPM_NAME = "python39-pako-0.3.1-1.4.noarch.rpm"
RPM_HASH = "fd6385b8e76d7ba262e08716268d3b7d1faf49bb1f93a91ea6f1f78a8b20bad6cd47f1974ce012a98a3f0c4a5c01f89633ca993e4a797eb05593e531c39316dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pako) python39-pako python3dist(pako)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-appdirs update-alternatives"

inherit rpm
