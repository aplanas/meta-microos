SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.16.3"

RPM_NAME = "python311-httpcore-0.16.3-2.1.noarch.rpm"
RPM_HASH = "f3318243d14633b3f5acd942dd7d97343b79615f0412b796511a8064af2056d73b70a1e44a0de229ee9a48be36bcfef6ac996453d86ef6f7ae0ea54f2e0605bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(httpcore) python311-httpcore python3dist(httpcore)"
RDEPENDS:${PN} += "(python311-anyio >= 3 with python311-anyio < 5) (python311-h11 >= 0.13.0 with python311-h11 < 0.15) (python311-sniffio >= 1.0 with python311-sniffio < 2) python(abi) python311-certifi"

inherit rpm
