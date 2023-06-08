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

RPM_NAME = "python310-requests-cache-0.6.3-1.9.noarch.rpm"
RPM_HASH = "0fb3310d0f451198c430110eae63f4d304cf5b8ab19a9ea05d78ecfa5d02eee7f199cb0a34493f21ac5e4f11435ee539dbfb2ec56abc985ebec8f97f34ee744a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-cache python3.10dist(requests-cache) python310-requests-cache python3dist(requests-cache)"
RDEPENDS:${PN} += "python(abi) python310-itsdangerous python310-requests python310-url-normalize"

inherit rpm
