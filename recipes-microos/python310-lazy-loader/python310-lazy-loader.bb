SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "python310-lazy-loader-0.2-1.2.noarch.rpm"
RPM_HASH = "5310aec945bae8ee7affd447616552c43092aaa72a91fcbf66672835b4120e5006c896f45804406d5931fb671aa04e4f1327432677037aa69637a5d0873ef4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazy-loader python3-lazy_loader python3.10dist(lazy-loader) python310-lazy-loader python310-lazy_loader python3dist(lazy-loader)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
