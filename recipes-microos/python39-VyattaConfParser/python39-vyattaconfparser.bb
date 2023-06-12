SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python39-VyattaConfParser-0.5.5-1.19.noarch.rpm"
RPM_HASH = "e1ba1f4ec7753b08cda02cf2fd6eef87c43823db7c79a252d23dcfc6d312bd403448065d3a983bc2e54874bb747535ccab36224625b8e93532e0347d45aebc3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vyattaconfparser) \
python39-VyattaConfParser \
python3dist(vyattaconfparser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
