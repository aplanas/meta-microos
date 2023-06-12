SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python311-VyattaConfParser-0.5.5-1.19.noarch.rpm"
RPM_HASH = "d35e311401af8afdcb2794b80df11f7259b8eb4b0c803508a31695716858ae035d3319fb913eb44ab732e52f461272705194993befe45a1c30fa2c0cd4ecff4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vyattaconfparser) \
python311-VyattaConfParser \
python3dist(vyattaconfparser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
