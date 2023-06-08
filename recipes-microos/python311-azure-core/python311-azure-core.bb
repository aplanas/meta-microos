SUMMARY = "Microsoft Azure Core Library for Python"
DESCRIPTION = "The Azure Core pipeline is a re-structuring of the msrest pipeline introduced in msrest 0.6.0. \
Further discussions on the msrest implementation can be found in the msrest wiki. \
 \
The Azure Core Pipeline is an implementation of chained policies as described in the \
Azure SDK guidelines. \
 \
The Python implementation of the pipeline has some mechanisms specific to Python. \
This is due to the fact that both synchronous and asynchronous implementations of the \
pipeline must be supported independently."
LICENSE = "MIT"

PV = "1.26.4"

RPM_NAME = "python311-azure-core-1.26.4-1.1.noarch.rpm"
RPM_HASH = "2180862b1da068e397276e635fe2e050f9fced98c353c1614e5d9a72e677b79ff4f8217ae540c5e63d8986e91802db3f21580696cf85da07fd2ff42dd3fac244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-core) python311-azure-core python3dist(azure-core)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-aiohttp python311-azure-nspkg python311-requests"

inherit rpm
