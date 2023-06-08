SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "1.2.58"

RPM_NAME = "python311-cloudscraper-1.2.58-3.11.noarch.rpm"
RPM_HASH = "9612d2774e365d49d076db32e58b5f492b26d55936df50bef2b8c3fc1536600d66b95b58e58e02d2d403af063e79c0913520ccbbcd5810571c7471f6ffe84baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cloudscraper) python311-cloudscraper python3dist(cloudscraper)"
RDEPENDS:${PN} += "python(abi) python311-pyparsing python311-requests python311-requests-toolbelt"

inherit rpm
