SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-leather-0.3.4-1.6.noarch.rpm"
RPM_HASH = "fb84ce6f2b09d7cd311a90b23d01a825e7dbdafcab9cb12ca98a25c506a8e42e7243123893b6b82a4dc1236429d8651d823fcbc42edcb5a50b61523bbad79b28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(leather) python311-leather python3dist(leather)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
