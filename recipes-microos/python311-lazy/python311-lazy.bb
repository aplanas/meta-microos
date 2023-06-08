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

RPM_NAME = "python311-lazy-1.5-1.3.noarch.rpm"
RPM_HASH = "d3d2c6c17028511a43d177ebb8725ba8ce18cb30a14ac26639884e2a756aba1e692c672d7efd12661fe0604b031dba417cfeab32bf72ae095a27dc449395672a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lazy) python311-lazy python3dist(lazy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
