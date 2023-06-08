SUMMARY = "Microsoft Azure Conversational Language Understanding Client Library for Python"
DESCRIPTION = "Conversational Language Understanding, aka CLU for short, is a cloud-based conversational \
AI service which is mainly used in bots to extract useful information from user utterance \
(natural language processing). The CLU analyze api encompasses two projects; conversation, \
and orchestration projects. You can use the 'conversation' project if you want to extract \
intents (intention behind a user utterance) and custom entities. You can also use the \
'orchestration' project which orchestrates multiple language apps to get the best response \
(language apps like Question Answering, Luis, and Conversation)."
LICENSE = "MIT"

PV = "1.1.0b1"

RPM_NAME = "python39-azure-ai-language-conversations-1.1.0b1-1.5.noarch.rpm"
RPM_HASH = "d0d006f0397a5521b5da1e303cef46aef0db17199b6cdea4b232d451c5fcc4f44c57d04cb3e0a57e7e826f874417d19f19ebcb83b055675cdda6df7623c794ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-language-conversations) python39-azure-ai-language-conversations python3dist(azure-ai-language-conversations)"
RDEPENDS:${PN} += "python(abi) python39-azure-ai-language-nspkg python39-azure-ai-nspkg python39-azure-common python39-azure-core python39-msrest python39-six"

inherit rpm
