SUMMARY = "Azure Text Translation Client Library for Python"
DESCRIPTION = "Text Translation is a cloud-based REST API feature of the Translator service that uses \
neural machine translation technology to enable quick and accurate source-to-target \
text translation in real time across all supported languages. \
 \
Use the Text Translation client library for Python to: \
 \
* Return a list of languages supported by Translate, Transliterate, and Dictionary operations. \
* Render single source-language text to multiple target-language texts with a single request. \
* Convert text of a source language in letters of a different script. \
* Return equivalent words for the source term in the target language. \
* Return grammatical structure and context examples for the source term and target term pair."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-ai-translation-text-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "ff073de5e73cfd101fae98e5faa00f79f3e1b722c6cdba4bf03ca517a37b47a5598a1f33c6779ace4fc6c2cd12aaf8795cf539aedd594496883543bb6610cc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-translation-text) python311-azure-ai-translation-text python3dist(azure-ai-translation-text)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-ai-nspkg python311-azure-ai-translation-nspkg python311-azure-common python311-azure-core python311-msrest"

inherit rpm
