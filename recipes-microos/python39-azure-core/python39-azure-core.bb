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

PV = "1.27.0"

RPM_NAME = "python39-azure-core-1.27.0-1.1.noarch.rpm"
RPM_HASH = "f7046e7c0654eb937df192adbd56e0fa4dbdb1c6c313a34176d206634c957f02ffeb139f869169dc23331d5b2a0320907bd31a7a6ccecd0aa5702414adfd3f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-core) python39-azure-core python3dist(azure-core)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-aiohttp python39-azure-nspkg python39-requests"

inherit rpm
