SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.19.5"

RPM_NAME = "python39-slack-sdk-3.19.5-1.3.noarch.rpm"
RPM_HASH = "1fea221171437e5b7c951bb888939cef589e0f4cf72e42cb5cc2deb5c2063d28856ec7840f80f1fed0528af0de0e2381c8ea18d16342184ba3299a87ef15413d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(slack-sdk) python39-slack-sdk python39-slackclient python3dist(slack-sdk)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
