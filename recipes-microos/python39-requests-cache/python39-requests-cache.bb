SUMMARY = "Persistent cache for requests library"
DESCRIPTION = "Requests-cache is a transparent persistent cache for requests_ library. \
 \
It can be useful when you are creating some simple data scraper with constantly \
changing parsing logic or data format, and don't want to redownload pages or \
write complex error handling and persistence. \
 \
Requests-cache ignores all cache headers, it just caches the data for the \
time you specify. \
 \
If you need library which knows how to use HTTP headers and status codes, \
take a look at `CacheControl <https://github.com/ionrock/cachecontrol>`_."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "python39-requests-cache-0.6.3-1.9.noarch.rpm"
RPM_HASH = "58f5e2cccb60b0ce2b87836c3e4415060ceef9bb8e16c56a6ee32bc6737f59180892fb0e7e63c229b0e1e4c73225a124261aa17691bbddd3e86ed07082a9af4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-cache) python39-requests-cache python3dist(requests-cache)"
RDEPENDS:${PN} += "python(abi) python39-itsdangerous python39-requests python39-url-normalize"

inherit rpm
