SUMMARY = "Expiry plug-in for Memoize that adds LRU cache expiration"
DESCRIPTION = "For the theory of Memoization, please see the Memoize module documentation. \
This module implements an expiry policy for Memoize that follows LRU \
semantics, that is, the last n results, where n is specified as the \
argument to the 'CACHESIZE' parameter, will be cached."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.56"

RPM_NAME = "perl-Memoize-ExpireLRU-0.56-1.23.noarch.rpm"
RPM_HASH = "0b156700e3f0af9e3623ed5dda869665e044f101fd00679882c211f874ae108fe88f8c9e01db49c78c28ba60ec52befdaef2ab065312826d43f55cb2d91450bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Memoize::ExpireLRU) \
perl-Memoize-ExpireLRU"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
