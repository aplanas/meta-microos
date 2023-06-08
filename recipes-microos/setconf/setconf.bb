SUMMARY = "Utility to easily change settings in configuration files"
DESCRIPTION = "setconf is a small utility that can be used for changing settings in \
configuration textfiles."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7"

RPM_NAME = "setconf-0.7.7-1.7.noarch.rpm"
RPM_HASH = "16431781da942fab1ac1d9bb4aac3e50f9c08b0a993096ad2a9a02ec4aa9bfd3a0f392cfd687bb2e9e27b15a4bab07eda5054a2826bbfa1a9fead7b6b0b94ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setconf"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
