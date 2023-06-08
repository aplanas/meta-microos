SUMMARY = "Microsoft Azure Document Translation Client Library for Python"
DESCRIPTION = "Azure Cognitive Services Document Translation is a cloud service that translates documents \
to and from 90 languages and dialects while preserving document structure and data format. \
Use the client library for Document Translation to: \
 \
 * Translate numerous, large files from an Azure Blob Storage container to a target container \
   in your language of choice. \
 * Check the translation status and progress of each document in the translation operation. \
 * Apply a custom translation model or glossaries to tailor translation to your specific case."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-ai-translation-document-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "904d49cb3ac45473e4505a14bd60fd855dc72d0ce90776d37ba34a3af3f35fe83dfb08cbeea06c6c4b07acac7f24558ad78b2fa88e8f74914add327941e6853f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-translation-document) python39-azure-ai-translation-document python3dist(azure-ai-translation-document)"
RDEPENDS:${PN} += "python(abi) python39-azure-ai-nspkg python39-azure-ai-translation-nspkg python39-azure-core python39-msrest"

inherit rpm
