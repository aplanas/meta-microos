SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python310-parallax-1.0.8-2.2.noarch.rpm"
RPM_HASH = "7c9137cf9b91132364c716b77171390e654196608b257dbcaf9d580deb81a060cb188e0a8760e594a577ed5d7f8cb858f283bd66826ce1c12ab03f26bb9b84ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parallax \
python3.10dist(parallax) \
python310-parallax \
python3dist(parallax)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
openssh \
python(abi) \
update-alternatives"

inherit rpm
