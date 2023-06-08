SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-ai-language-questionanswering-1.1.0-1.3.noarch.rpm"
RPM_HASH = "5f01e42588848050e2355177a07826e973de843c8a713e035455d166cb1bf8f1d035eace6420bebf184c0fe69ab7de806a93aef57613c28a49d248d2b5dad3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-language-questionanswering) python311-azure-ai-language-questionanswering python3dist(azure-ai-language-questionanswering)"
RDEPENDS:${PN} += "python(abi) python311-azure-ai-language-nspkg python311-azure-ai-nspkg python311-azure-core python311-isodate"

inherit rpm
