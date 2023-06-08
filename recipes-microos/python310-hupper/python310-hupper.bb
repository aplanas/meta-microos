SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python310-hupper-1.10.3-1.4.noarch.rpm"
RPM_HASH = "c2b28593df834940cd1b1583d030be00964b3d9864bbf340698becb70d0bc41411dc915baf59a428526c164a7a54e3026b321d2f454c7eab428edb393784f220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hupper python3.10dist(hupper) python310-hupper python3dist(hupper)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-watchdog update-alternatives"

inherit rpm
