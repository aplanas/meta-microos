SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python310-circuitbreaker-1.3.2-1.8.noarch.rpm"
RPM_HASH = "6ba98f16572cf86b5d01de9bd7a064f90cfdacf7f62c2fe3b343edef78269c2d5aa1824b9153d8969ace5f7a34e465e229726af11908898985a78fa6bbcfa1ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-circuitbreaker \
python3.10dist(circuitbreaker) \
python310-circuitbreaker \
python3dist(circuitbreaker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
