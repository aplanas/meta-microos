SUMMARY = "Miscellaneous utils for asyncio"
DESCRIPTION = "Miscellaneous utils for asyncio."
LICENSE = "MIT"

PV = "17.3.0"

RPM_NAME = "python310-aiomisc-17.3.0-1.1.noarch.rpm"
RPM_HASH = "3f29c0143983937a53ed3b4f473e900e19d8fc7622b3dbd681eab69a971c24aa2b0dfaa4d961fe7b2dfefbf88b856274c6e247f14fd648cdba3311cf9f2411a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiomisc python3.10dist(aiomisc) python310-aiomisc python3dist(aiomisc)"
RDEPENDS:${PN} += "python(abi) python310-colorlog python310-logging-journald"

inherit rpm
