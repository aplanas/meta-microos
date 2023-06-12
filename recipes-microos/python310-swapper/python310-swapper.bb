SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.1.2.post1"

RPM_NAME = "python310-swapper-1.1.2.post1-2.7.noarch.rpm"
RPM_HASH = "9b346a718ac684986a4a2736a2bad6840bf60fe9d2d1fc39e618120e6d59e21d455ade2445cc4e0f613edfecb9fc7a273f21f06b1f89a025989bbf9d41bdfe71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swapper \
python3.10dist(swapper) \
python310-swapper \
python3dist(swapper)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
