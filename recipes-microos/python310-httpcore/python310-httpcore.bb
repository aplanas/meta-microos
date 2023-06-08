SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.16.3"

RPM_NAME = "python310-httpcore-0.16.3-2.1.noarch.rpm"
RPM_HASH = "b69d7370ad37501a34800317b2c09612dd72762ff81aa5b791a935873ebf086f4e7f1ca1becba83d54c467eaef6dd80bb145854472765f39754d8d23677499ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpcore python3.10dist(httpcore) python310-httpcore python3dist(httpcore)"
RDEPENDS:${PN} += "(python310-anyio >= 3 with python310-anyio < 5) (python310-h11 >= 0.13.0 with python310-h11 < 0.15) (python310-sniffio >= 1.0 with python310-sniffio < 2) python(abi) python310-certifi"

inherit rpm
