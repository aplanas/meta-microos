SUMMARY = "GrandOrgue demo sampleset"
DESCRIPTION = "This package contains the demo sampleset for GrandOrgue."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.1"

RPM_NAME = "grandorgue-demo-3.11.1-1.1.noarch.rpm"
RPM_HASH = "dabd7c1c21e8a2a99bf4785fe4ba32fabf2591ea1074cb8cf3be8c81ec9e4cbe38ad9e500dafdeb2ca97e093f1146fce55ffcae894056c7b55a1b41568e1ee9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grandorgue-demo"
RDEPENDS:${PN} += ""

inherit rpm
