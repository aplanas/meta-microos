SUMMARY = "Wikipedia API for Python"
DESCRIPTION = "Wikipedia is a Python library that makes it easy to access and parse \
data from Wikipedia. \
 \
Search Wikipedia, get article summaries, get data like links and images \
from a page, and more. Wikipedia wraps the `MediaWiki \
API <https://www.mediawiki.org/wiki/API>`__ so you can focus on using \
Wikipedia data, not getting it."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-wikipedia-1.4.0-4.12.noarch.rpm"
RPM_HASH = "aaccb83e385401720693e38f93f846a60326b2f8ba521e01f003adc6f0aeabec9860b216c2dd00b709fde4d3cbdd89b5c497a500c62cdca705af18c1ef42a5d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wikipedia python3.10dist(wikipedia) python310-wikipedia python3dist(wikipedia)"
RDEPENDS:${PN} += "python(abi) python310-beautifulsoup4 python310-requests"

inherit rpm
