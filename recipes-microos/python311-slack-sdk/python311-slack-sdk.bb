SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.21.3"

RPM_NAME = "python311-slack-sdk-3.21.3-1.1.noarch.rpm"
RPM_HASH = "ffccd86e630b079696381cbb78383e0e7c607fc8fe03f13d70b92ce3c4f14d54224086ea30ba8fb52ae96544024cccf172f237d72c926832654b490222e479dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(slack-sdk) python311-slack-sdk python311-slackclient python3dist(slack-sdk)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
