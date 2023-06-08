SUMMARY = "Lazy attributes for Python objects"
DESCRIPTION = "Lazy attributes are computed attributes that are evaluated only once, \
the first time they are used. Subsequent uses return the results of \
the first call. They come handy when code should run \
 * late, i.e. just before it is needed, and \
 * once, i.e. not twice, in the lifetime of an object. \
You can think of it as deferred initialization. The possibilities are \
endless."
LICENSE = "BSD-2-Clause"

PV = "1.5"

RPM_NAME = "python39-lazy-1.5-1.3.noarch.rpm"
RPM_HASH = "f53ccaa6c45cf1364689a73a6ffcb2cc4d501f3336ddd0ab865f3a9f925601faa9f08cebfb1e6e39748c23552cc3c5e6c1b38518650444789d1662af46e7df14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lazy) python39-lazy python3dist(lazy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
