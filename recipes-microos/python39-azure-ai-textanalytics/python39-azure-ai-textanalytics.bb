SUMMARY = "Azure Text Analytics client library for Python"
DESCRIPTION = "Text Analytics is a cloud-based service that provides advanced natural language \
processing over raw text, and includes six main functions: \
 \
* Sentiment Analysis \
* Named Entity Recognition \
* Personally Identifiable Information (PII) Entity Recognition \
* Linked Entity Recognition \
* Language Detection \
* Key Phrase Extraction"
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "python39-azure-ai-textanalytics-5.2.1-1.3.noarch.rpm"
RPM_HASH = "a194ac1cff053e9408f772953885f541901d568f4bfd2fa6f644a2e583d179585378b4a87add02845f5680ebef4ba6b240fd2a861d8c101b2999e68a03360386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-textanalytics) python39-azure-ai-textanalytics python3dist(azure-ai-textanalytics)"
RDEPENDS:${PN} += "python(abi) python39-azure-ai-nspkg python39-azure-common python39-azure-core python39-msrest python39-typing_extensions"

inherit rpm
