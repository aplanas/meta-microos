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

RPM_NAME = "python39-azure-core-1.26.4-1.1.noarch.rpm"
RPM_HASH = "e93ea9c8cf406335f8265b8cc1e5831a7c9c67a19e0dbe72989fb2ae5a86f3f6ed02c60b1c32e77beecdaccaf3b29a6a95a22d3bd64d3562db877a1aefccac09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-core) python39-azure-core python3dist(azure-core)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-aiohttp python39-azure-nspkg python39-requests"

inherit rpm
