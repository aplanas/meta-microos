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

RPM_NAME = "python310-azure-core-1.26.4-1.1.noarch.rpm"
RPM_HASH = "e8d3b5df3119b9f3e7f38924fc2d0149d64c684d21ab8fcfdf8d90cba2b42d88d99d25b2b2b47493a75a503ccb544e520f809a1276f7c28ff66a74fe39235b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core python3.10dist(azure-core) python310-azure-core python3dist(azure-core)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-aiohttp python310-azure-nspkg python310-requests"

inherit rpm
