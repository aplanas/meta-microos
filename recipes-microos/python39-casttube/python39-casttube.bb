SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-casttube-0.2.1-2.3.noarch.rpm"
RPM_HASH = "6e7ecd3884bfe1092e9fcfb1855adec03aaa3ca80a4b249f54925a7b9e71728965bf75859453a6e3871d0f71c30a4b4d1a05fe7c0d5e73a1dc0c64c97669075a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(casttube) python39-casttube python3dist(casttube)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
