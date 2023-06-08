SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python310-pythonfinder-1.3.1-3.4.noarch.rpm"
RPM_HASH = "ddd17d614b8ad02b5ed0ebf195872a1f078972e78f93452abf594c1ca9b2a568d0f6d590553fe8f66330306f304da266406cd4a349648a0201419f2196e93b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythonfinder python3.10dist(pythonfinder) python310-pythonfinder python3dist(pythonfinder)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-attrs python310-cached-property python310-click python310-packaging python310-vistir update-alternatives"

inherit rpm
