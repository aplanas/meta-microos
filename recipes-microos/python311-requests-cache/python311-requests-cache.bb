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

RPM_NAME = "python311-requests-cache-0.6.3-1.9.noarch.rpm"
RPM_HASH = "5b877dfbdf87b0b224b2b98363518ac8b451689d4dacbcaa483a45c99eca5b9c38e472c8845133a4f4387c3c9cf21d0b0aaf0a0c9df4c45945fda0ba0db2ee6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-cache) python311-requests-cache python3dist(requests-cache)"
RDEPENDS:${PN} += "python(abi) python311-itsdangerous python311-requests python311-url-normalize"

inherit rpm
