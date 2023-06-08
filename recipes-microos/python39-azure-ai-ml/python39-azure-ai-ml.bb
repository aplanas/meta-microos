SUMMARY = "Microsoft Azure Machine Learning Client Library for Python"
DESCRIPTION = "We are excited to introduce the public preview of Azure Machine Learning Python \
SDK v2. The Python SDK v2 introduces new SDK capabilities like standalone local \
jobs, reusable components for pipelines and managed online/batch inferencing. \
Python SDK v2 allows you to move from simple to complex tasks easily and \
incrementally. This is enabled by using a common object model which brings \
concept reuse and consistency of actions across various tasks. The SDK v2 shares \
its foundation with the CLI v2 which is currently in also in public preview. \
 \
This package has been tested with Python 3.6, 3.7, 3.8, 3.9 and 3.10."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-azure-ai-ml-1.6.0-1.1.noarch.rpm"
RPM_HASH = "4172f25a9f2d963cb96656b626e5b490c252709900b077993fc0141e1c515a17d611b89a3fa55a5fec05d26cdceed2f338a395ef11e9bd2054085ef21eb2b590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-ml) python39-azure-ai-ml python3dist(azure-ai-ml)"
RDEPENDS:${PN} += "python(abi) python39-PyJWT python39-PyYAML python39-applicationinsights python39-azure-ai-nspkg python39-azure-common python39-azure-core python39-azure-identity python39-azure-mgmt-core python39-azure-storage-blob python39-azure-storage-file-datalake python39-azure-storage-file-share python39-colorama python39-docker python39-isodate python39-jsonschema python39-marshmallow python39-msrest python39-pathspec python39-pydash python39-strictyaml python39-tqdm python39-typing-extensions"

inherit rpm
