SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python311-aspectlib-2.0.0-1.1.noarch.rpm"
RPM_HASH = "c60a0f904b2dabbba31450b7c564a42e2f22aa34b37d8e0998805efc971c387cfa7999f2faf8402c027d1bcea346ea1365cadbfe5f699d2ba805b63debb96065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aspectlib) python311-aspectlib python3dist(aspectlib)"
RDEPENDS:${PN} += "python(abi) python311-fields"

inherit rpm
