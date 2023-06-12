SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-click-threading-0.5.0-1.8.noarch.rpm"
RPM_HASH = "dfb4865d904951f60fccfc2b6dadefa935b335081199510eee17700d6908048b23b3de7bb8af024a90f151c35cd3fe88776bbcedab8bb173e7e9c685648e5751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-threading \
python3.10dist(click-threading) \
python310-click-threading \
python3dist(click-threading)"
RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
