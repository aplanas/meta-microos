SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-traittypes-0.2.1-9.2.noarch.rpm"
RPM_HASH = "0705443eec651e7163399989ec217b89d238cd33055c0e366121faf243ce55a68b7cd85bbfdd3ec182a2e31f75e14b408a76cd94d82695c3f154e964a92ed49f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(traittypes) python39-traittypes python3dist(traittypes)"
RDEPENDS:${PN} += "python(abi) python39-traitlets"

inherit rpm
