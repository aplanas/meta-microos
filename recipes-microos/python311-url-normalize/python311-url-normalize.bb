SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python311-url-normalize-1.4.3-2.1.noarch.rpm"
RPM_HASH = "276600452d566526f08dfb451f52cfabea312a41dd713aa0489525c87b424e9841a0d9b86c232bd848259f6285ad48fb94460fd60e6a7947811ca20c04d9d2d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(url-normalize) python311-url-normalize python311-url_normalize python3dist(url-normalize)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
