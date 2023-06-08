SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-azure-loganalytics-0.1.1-1.8.noarch.rpm"
RPM_HASH = "b17c73cb8247b59045ae84b4d5d0b84af564f400e02e7e45b983d29f00abaa172284b0b4021302f0ec281912b3c4a21451b4bb093e03fe644fe7ec39206753d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-loganalytics) python39-azure-loganalytics python3dist(azure-loganalytics)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-nspkg python39-msrest"

inherit rpm
