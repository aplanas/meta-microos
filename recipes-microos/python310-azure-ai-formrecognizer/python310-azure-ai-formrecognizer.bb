SUMMARY = "Microsoft Azure Form Recognizer Client Library for Python"
DESCRIPTION = "Azure Cognitive Services Form Recognizer is a cloud service that uses machine learning \
to recognize text and table data from form documents. It includes the following main \
functionalities: \
 \
 * Custom models - Recognize field values and table data from forms. These models are \
   trained with your own data, so they're tailored to your forms. \
 * Content API - Recognize text and table structures, along with their bounding box coordinates, \
   from documents. Corresponds to the REST service's Layout API. \
 * Prebuilt receipt model - Recognize data from USA sales receipts using a prebuilt model."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python310-azure-ai-formrecognizer-3.2.1-1.2.noarch.rpm"
RPM_HASH = "eaa8da405d51b2b3dc73fe01e603c8f915fb2e72a5e87a4678294f6b6f4193fe6227c8698acec0f9735b41c0cc0897bc1b350bea10ef269ce3bc071286a66b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-formrecognizer python3.10dist(azure-ai-formrecognizer) python310-azure-ai-formrecognizer python3dist(azure-ai-formrecognizer)"
RDEPENDS:${PN} += "python(abi) python310-azure-ai-nspkg python310-azure-common python310-azure-core python310-msrest python310-typing_extensions"

inherit rpm
