SUMMARY = "Run kubectl commands in all/some contexts in parallel"
DESCRIPTION = "Run a kubectl command in one or more contexts (clusters) in parallel (similar to GNU parallel/xargs)."
LICENSE = "Apache-2.0"

PV = "0.2.1"

RPM_NAME = "kubectl-foreach-0.2.1-1.3.aarch64.rpm"
RPM_HASH = "613cbf3b36649b453d8e8bc29d79620378cf99acc83feb204a0b9d18805cd550d1830ab244de9703696031e939ee3a40be57519fcf46498beef440ec1cdf4d3f"

RPROVIDES:${PN} += "kubectl-foreach kubectl-foreach(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
