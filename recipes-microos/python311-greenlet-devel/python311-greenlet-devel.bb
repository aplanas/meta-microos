SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-greenlet-devel-2.0.2-1.1.noarch.rpm"
RPM_HASH = "654904f47854d3b7c503d778102aef702a527c0c5a42a3e763a1e9d05d737713b1ac891464041eed6221725f0c85aab3d51f6046fb075a46da62b72b71b12bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-greenlet-devel"
RDEPENDS:${PN} += "python311-greenlet"

inherit rpm
