SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.19.5"

RPM_NAME = "python311-slack-sdk-3.19.5-1.3.noarch.rpm"
RPM_HASH = "b8152802ed0b42663d03077d927cab2413925367a121bb88d9a28dc0c2e3b8c29f9c354e0a4088598cf1a35f4b12605c126f097ad19e986fa78a76c597325b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(slack-sdk) python311-slack-sdk python311-slackclient python3dist(slack-sdk)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
